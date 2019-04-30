package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020493 Numbers n such that <code>d(n)</code> (number of divisors) divides <code>phi(n)</code> (Euler function) divides <code>sigma(n)</code> (sum of divisors).
 * @author Sean A. Irvine
 */
public class A020493 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z phi = fs.phi();
      if (Z.ZERO.equals(phi.mod(fs.sigma0())) && Z.ZERO.equals(fs.sigma().mod(phi))) {
        return Z.valueOf(mN);
      }
    }
  }
}
