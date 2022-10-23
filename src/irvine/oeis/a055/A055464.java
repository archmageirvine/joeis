package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055464 Numbers n such that sum of EulerPhi and DivisorSum is an integer multiple of the number of divisors.
 * @author Sean A. Irvine
 */
public class A055464 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().add(fs.sigma()).mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
