package irvine.oeis.a006;

/**
 * A006699 T(3,3n), where T(k,m) is the number of sequences a_1,...,a_m of integers 0,1,...,n with n=floor(m/k) such that the 'bumped' sequence b_1,...,b_m has exactly k of each of 0,...,n-1, where b_i=a_i + j (mod n+1) with minimal j&gt;=0 such that b_0,...,b_i contain at most k elements equal to b_i.
 * @author Sean A. Irvine
 */
public class A006699 extends A006698 {

  @Override
  protected long m() {
    return 3;
  }
}
