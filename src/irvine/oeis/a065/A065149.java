package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065149 Composite numbers m such that phi(m)*sigma(m) is divisible by m-1.
 * @author Sean A. Irvine
 */
public class A065149 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.phi().modMultiply(fs.sigma(), c.subtract(1)).isZero()) {
        return c;
      }
    }
  }
}

