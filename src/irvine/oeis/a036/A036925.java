package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036925 Digit sum of composite odd number equals digit sum of juxtaposition of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036925 implements Sequence {

  private Z mN = Z.valueOf(23);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        long jux = 0;
        final FactorSequence fs = Cheetah.factor(mN);
        for (final Z p : fs.toZArray()) {
          jux += ZUtils.digitSum(p) * fs.getExponent(p);
        }
        if (ZUtils.digitSum(mN) == jux) {
          return mN;
        }
      }
    }
  }
}
