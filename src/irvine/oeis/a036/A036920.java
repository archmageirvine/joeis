package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036920 Composite numbers n such that digit sum of n equals digit sum of sum of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036920 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        Z sum = Z.ZERO;
        final FactorSequence fs = Cheetah.factor(mN);
        for (final Z p : fs.toZArray()) {
          sum = sum.add(p.multiply(fs.getExponent(p)));
        }
        if (ZUtils.digitSum(mN) == ZUtils.digitSum(sum)) {
          return mN;
        }
      }
    }
  }
}
