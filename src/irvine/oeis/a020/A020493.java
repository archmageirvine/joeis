package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020493 Numbers n such that d(n) (number of divisors) divides phi(n) (Euler function) divides sigma(n) (sum of divisors).
 * @author Sean A. Irvine
 */
public class A020493 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z phi = fs.phi();
      if (phi.mod(fs.sigma0()).isZero() && fs.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
