package irvine.oeis.a006;

/**
 * A006699 <code>T(3,3n)</code>, where <code>T(k,m)</code> is the number of sequences <code>a_1,...,a_m</code> of integers <code>0,1,...,n</code> with <code>n=floor(m/k)</code> such that the 'bumped' sequence <code>b_1,...,b_m</code> has exactly k of each of <code>0,...,n-1</code>, where <code>b_i=a_i + j (mod n+1)</code> with minimal <code>j&gt;=0</code> such that <code>b_0,...,b_i</code> contain at most k elements equal to <code>b_i</code>.
 * @author Sean A. Irvine
 */
public class A006699 extends A006698 {

  @Override
  protected long m() {
    return 3;
  }
}
