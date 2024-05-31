package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038719 Triangle T(n,k) (0 &lt;= k &lt;= n) giving number of chains of length k in partially ordered set formed from subsets of n-set by inclusion.
 * @author Sean A. Irvine
 */
public class A038719 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.STIRLING2.z(mN + 2, mM + 2).subtract(Functions.STIRLING2.z(mN + 1, mM + 2)).multiply(Functions.FACTORIAL.z(mM));
  }
}
