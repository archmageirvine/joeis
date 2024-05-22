package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065556 Numbers n such that sigma (phi ( n ) ) = sigma (sigma (n ) ) where phi is Euler's totient and sigma is the multiplicative sum-of-divisors function.
 * @author Sean A. Irvine
 */
public class A065556 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).sigma().equals(Functions.SIGMA1.z(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
