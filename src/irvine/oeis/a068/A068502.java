package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068502 Composite numbers k such that gcd(sigma(k), k) = gcd(k, phi(k)).
 * @author Sean A. Irvine
 */
public class A068502 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().gcd(c).equals(fs.phi().gcd(c))) {
        return c;
      }
    }
  }
}

