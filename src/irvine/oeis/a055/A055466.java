package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055466 Numbers n such that d(n)^2 divides phi(n) + sigma(n).
 * @author Sean A. Irvine
 */
public class A055466 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().add(fs.sigma()).mod(fs.sigma0().square()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
