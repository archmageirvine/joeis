package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066850 Numbers k such that phi(phi(k)) + sigma(sigma(k)) = phi(sigma(k)) + sigma(phi(k)), where phi=A000010 is Euler's totient function and sigma=A000203 is the sum of divisors function.
 * @author Sean A. Irvine
 */
public class A066850 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(fs.phi());
      final FactorSequence fs2 = Jaguar.factor(fs.sigma());
      if (fs1.phi().add(fs2.sigma()).equals(fs1.sigma().add(fs2.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
