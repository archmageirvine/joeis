package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068014 Nonprimes n such that 1+phi(n) and -1 + sigma(n) are prime numbers.
 * @author Sean A. Irvine
 */
public class A068014 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().subtract(1).isProbablePrime() && fs.phi().add(1).isProbablePrime()) {
        return c;
      }
    }
  }
}
