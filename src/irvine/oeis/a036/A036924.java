package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A036924 Digit sum of composite even number equals digit sum of juxtaposition of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036924 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      long jux = 0;
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        jux += ZUtils.digitSum(p) * fs.getExponent(p);
      }
      if (ZUtils.digitSum(mN) == jux) {
        return mN;
      }
    }
  }
}
