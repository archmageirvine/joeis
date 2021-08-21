package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050934 Numbers n such that phi(n)*d(n) is a multiple of sigma(n), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A050934 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.phi().multiply(fs.sigma0()).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
