package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069237 Composite n such that tau(n) divides phi(n), where tau(n) is the number of divisors of n and phi(n) the Euler totient function.
 * @author Sean A. Irvine
 */
public class A069237 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.phi().mod(fs.sigma0()).isZero()) {
        return n;
      }
    }
  }
}

