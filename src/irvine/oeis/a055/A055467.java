package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A055467 Nonprime numbers for which phi(n) + sigma(n) is an integer multiple of the cube of the number of divisors.
 * @author Sean A. Irvine
 */
public class A055467 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.phi().add(fs.sigma()).mod(fs.sigma0().pow(3)).isZero()) {
        return n;
      }
    }
  }
}
