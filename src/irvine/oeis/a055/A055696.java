package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055696 Numbers n such that n | Sigma_2(n) + Phi(n)^2.
 * @author Sean A. Irvine
 */
public class A055696 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(2).add(fs.phi().square()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
