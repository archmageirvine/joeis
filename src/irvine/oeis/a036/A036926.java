package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036926.
 * @author Sean A. Irvine
 */
public class A036926 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      long jux = 0;
      Z sum = Z.ZERO;
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        jux += ZUtils.digitSum(p) * fs.getExponent(p);
        sum = sum.add(p.multiply(fs.getExponent(p)));
      }
      if (ZUtils.digitSum(mN) == jux && jux == ZUtils.digitSum(sum)) {
        return mN;
      }
    }
  }
}
