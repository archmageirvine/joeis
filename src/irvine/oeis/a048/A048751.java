package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048751 Composites k whose product of divisors divided by number of divisors is an integer.
 * @author Sean A. Irvine
 */
public class A048751 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = Functions.PRODUCT.z(fs.divisors()).divideAndRemainder(s0);
        if (qr[1].isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
