package irvine.oeis.a006;

/**
 * A006700 <code>T(n,3,1)</code>, where <code>T(n,k,s)</code> with <code>0&lt;=s&lt;n</code> is the number of sequences <code>a_1,...,a_(k*n+s)</code> of integers <code>0,1,...,n</code> such that the 'bumped' sequence <code>b_1,...,b_(k*n+s)</code> has exactly s n's, where <code>b_i=a_i + j (mod n+1)</code> with minimal <code>j&gt;=0</code> such that <code>b_0,...,b_i</code> contain at most k elements equal to <code>b_i</code>.
 * @author Sean A. Irvine
 */
public class A006700 extends A006698 {

  @Override
  protected long start() {
    return super.start() + 1;
  }

  @Override
  protected long m() {
    return 3;
  }
}
