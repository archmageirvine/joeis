package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065146 Numbers n such that the arithmetic, geometric and harmonic means of phi(n) and sigma(n) are all integers.
 * @author Sean A. Irvine
 */
public class A065146 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      final Z sigma = fs.sigma();
      final Z sum = phi.add(sigma);
      if (sum.isEven()) {
        final Z prod = sigma.multiply(phi);
        if (prod.multiply2().mod(sum).isZero() && prod.isSquare()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

