package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036923 Odd composite numbers n such that the digit sum of n equals digit sum of sum of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036923 extends Sequence1 {

  private Z mN = Z.valueOf(25);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mN.isProbablePrime()) {
        Z sum = Z.ZERO;
        final FactorSequence fs = Jaguar.factor(mN);
        for (final Z p : fs.toZArray()) {
          sum = sum.add(p.multiply(fs.getExponent(p)));
        }
        if (Functions.DIGIT_SUM.l(mN) == Functions.DIGIT_SUM.l(sum)) {
          return mN;
        }
      }
    }
  }
}
