package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065555 Numbers n such that phi(phi(n)) = phi(sigma(n)) where phi is Euler's totient and sigma is the multiplicative sum-of-divisors function.
 * @author Sean A. Irvine
 */
public class A065555 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.PHI.z(fs.phi()).equals(Functions.PHI.z(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
