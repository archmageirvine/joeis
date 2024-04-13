package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036926 Digit sum of 'even' number equals digit sum of 'sum' and 'juxtaposition' of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036926 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      long jux = 0;
      Z sum = Z.ZERO;
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        jux += Functions.DIGIT_SUM.l(p) * fs.getExponent(p);
        sum = sum.add(p.multiply(fs.getExponent(p)));
      }
      if (Functions.DIGIT_SUM.l(mN) == jux && jux == Functions.DIGIT_SUM.l(sum)) {
        return mN;
      }
    }
  }
}
