package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068484 Numbers k that divide phi(k)^2 + sigma(k)^2.
 * @author Sean A. Irvine
 */
public class A068484 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().square().add(fs.sigma().square()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

