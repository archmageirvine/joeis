package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055700 Numbers n such that n | Sigma_6(n) + Phi(n)^6.
 * @author Sean A. Irvine
 */
public class A055700 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(6).add(fs.phi().pow(6)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
