package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048752 Mean integral divisors associated with A048751.
 * @author Sean A. Irvine
 */
public class A048752 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = Functions.PRODUCT.z(fs.divisors()).divideAndRemainder(s0);
        if (qr[1].isZero()) {
          return qr[0];
        }
      }
    }
  }
}
