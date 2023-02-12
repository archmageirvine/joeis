package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061367 Composite n such that sigma(n)-phi(n) divides sigma(n)+phi(n).
 * @author Sean A. Irvine
 */
public class A061367 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z phi = fs.phi();
        final Z sigma = fs.sigma();
        if (sigma.add(phi).mod(sigma.subtract(phi)).isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

