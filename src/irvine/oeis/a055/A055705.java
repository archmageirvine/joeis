package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055705 Numbers n such that n | Sigma_11(n) - Phi(n)^11.
 * @author Sean A. Irvine
 */
public class A055705 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(11).subtract(fs.phi().pow(11)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
