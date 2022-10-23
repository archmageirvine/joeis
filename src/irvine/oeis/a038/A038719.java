package irvine.oeis.a038;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038719 Triangle T(n,k) (0 &lt;= k &lt;= n) giving number of chains of length k in partially ordered set formed from subsets of n-set by inclusion.
 * @author Sean A. Irvine
 */
public class A038719 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Stirling.secondKind(mN + 2, mM + 2).subtract(Stirling.secondKind(mN + 1, mM + 2)).multiply(mF.factorial(mM));
  }
}
