package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A036920 Composite numbers n such that digit sum of n equals digit sum of sum of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036920 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        Z sum = Z.ZERO;
        final FactorSequence fs = Jaguar.factor(mN);
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
