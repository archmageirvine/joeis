package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064094 Triangle composed of generalized Catalan numbers.
 * @author Sean A. Irvine
 */
public class A064094 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mN == mM) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, mN - mM - 1, k -> Binomial.binomial(mN - mM - 1 + k, k).multiply(mN - mM - k).multiply(Z.valueOf(mM).pow(k)).divide(mN - mM));
  }
}
