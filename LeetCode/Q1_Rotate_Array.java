class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int[] arr = new int[n];
        k=k%n;
        int x=0;
        for(int i=k;i<n;i++){
            arr[i]=nums[x];
            x++;
        }
          
        for(int i=0;i<k;i++){
            arr[i]=nums[x];
            x++;
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}
