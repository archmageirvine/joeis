package irvine.oeis.a006;

/**
 * A006700 T(n,3,1), where T(n,k,s) with 0&lt;=s&lt;n is the number of sequences a_1,...,a_(k*n+s) of integers 0,1,...,n such that the 'bumped' sequence b_1,...,b_(k*n+s) has exactly s n's, where b_i=a_i + j (mod n+1) with minimal j&gt;=0 such that b_0,...,b_i contain at most k elements equal to b_i.
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
