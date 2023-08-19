package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065150 Numbers k such that the harmonic mean of phi(k) and sigma(k) is an integer.
 * @author Sean A. Irvine
 */
public class A065150 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      final Z sigma = fs.sigma();
      final Z sum = phi.add(sigma);
      final Z prod = sigma.multiply(phi);
      if (prod.multiply2().mod(sum).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

