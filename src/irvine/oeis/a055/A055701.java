package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055701 Numbers n such that n | Sigma_7(n) - Phi(n)^7.
 * @author Sean A. Irvine
 */
public class A055701 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(7).subtract(fs.phi().pow(7)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
