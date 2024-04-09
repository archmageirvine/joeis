package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050934 Numbers k such that phi(k)*d(k) is a multiple of sigma(k), where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A050934 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(fs.sigma0()).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
