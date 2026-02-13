package irvine.oeis.a083;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083792 Lexicographically first increasing sequence such that no two successive terms have the same prime signature.
 * @author Sean A. Irvine
 */
public class A083792 extends Sequence1 {

  private Z mPrev = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sig = FactorUtils.leastPrimeSignature(++mN);
      if (!mPrev.equals(sig)) {
        mPrev = sig;
        return Z.valueOf(mN);
      }
    }
  }
}
