package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036925 Digit sum of composite odd number equals digit sum of juxtaposition of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036925 extends Sequence1 {

  private Z mN = Z.valueOf(23);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        long jux = 0;
        final FactorSequence fs = Jaguar.factor(mN);
        for (final Z p : fs.toZArray()) {
          jux += Functions.DIGIT_SUM.l(p) * fs.getExponent(p);
        }
        if (Functions.DIGIT_SUM.l(mN) == jux) {
          return mN;
        }
      }
    }
  }
}
