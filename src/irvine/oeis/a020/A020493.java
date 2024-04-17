package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020493 Numbers k such that d(k) (number of divisors) divides phi(k) (Euler function) divides sigma(k) (sum of divisors).
 * @author Sean A. Irvine
 */
public class A020493 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      if (phi.mod(fs.sigma0()).isZero() && fs.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
