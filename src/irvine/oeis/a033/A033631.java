package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033631 Numbers k such that sigma(phi(k)) = sigma(k) where sigma is the sum of divisors function A000203 and phi is the Euler totient function A000010.
 * @author Sean A. Irvine
 */
public class A033631 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sigma = fs.sigma();
      final Z phi = fs.phi();
      if (Functions.SIGMA.z(phi).equals(sigma)) {
        return Z.valueOf(mN);
      }
    }
  }
}
