package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059202 Triangle T(n,m) of numbers of m-block T_0-covers of a labeled n-set, m = 0..2^n - 1.
 * @author Sean A. Irvine
 */
public class A059202 extends Sequence0 {

  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= 1L << mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Stirling.firstKind(mN + 1, k + 1).multiply(Binomial.binomial((1L << k) - 1, mM)));
  }
}
