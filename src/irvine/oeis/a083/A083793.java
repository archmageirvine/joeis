package irvine.oeis.a083;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083793 Numbers k such that k and k-1 have the same prime signature. Numbers not included in A083792.
 * @author Sean A. Irvine
 */
public class A083793 extends Sequence1 {

  private Z mPrev = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sig = FactorUtils.leastPrimeSignature(++mN);
      if (mPrev.equals(sig)) {
        return Z.valueOf(mN);
      }
      mPrev = sig;
    }
  }
}
