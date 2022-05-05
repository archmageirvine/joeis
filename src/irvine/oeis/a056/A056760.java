package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056760 Integers with exactly 2 prime divisors such that the cube of the number of divisors exceeds the number.
 * @author Sean A. Irvine
 */
public class A056760 implements Sequence {

  private static final Z LAST = Z.valueOf(248832);
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    if (LAST.equals(mN)) {
      return null;
    }
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      if (fs.omega() == 2 && fs.sigma0().pow(3).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}
