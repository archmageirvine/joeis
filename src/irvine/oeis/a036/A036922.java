package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036922 Digit sum of 'even' number equals digit sum of sum of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036922 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
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
