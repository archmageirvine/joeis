package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068559 Numbers m such that phi(m) = tau(m)^3.
 * @author Sean A. Irvine
 */
public class A068559 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(fs.sigma0().pow(3))) {
        return Z.valueOf(mN);
      }
    }
  }
}
