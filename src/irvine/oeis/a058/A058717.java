package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058717 Triangle T(n,k) giving number of nonisomorphic loopless matroids of rank k on n labeled points (n &gt;= 1, 1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A058717 extends A058716 {

  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
