package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036927.
 * @author Sean A. Irvine
 */
public class A036927 implements Sequence {

  private Z mN = Z.valueOf(25);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
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
}
