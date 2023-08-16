package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065116 Numbers k such that sigma(k) + tau(k) and sigma(k) - tau(k) are primes.
 * @author Sean A. Irvine
 */
public class A065116 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final long r = ++mN % 10;
      if (r != 4 && r != 6) {
        final FactorSequence fs = Jaguar.factor(mN);
        final Z sigma = fs.sigma();
        final Z tau = fs.sigma0();
        if (sigma.subtract(tau).isProbablePrime() && sigma.add(tau).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

