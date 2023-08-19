package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A065148 Nonprimes m such that phi(m)*sigma(m) is divisible by m+1.
 * @author Sean A. Irvine
 */
public class A065148 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.phi().modMultiply(fs.sigma(), c.add(1)).isZero()) {
        return c;
      }
    }
  }
}

