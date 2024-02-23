package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068560 Numbers k such that phi(k) = tau(k)^2.
 * @author Sean A. Irvine
 */
public class A068560 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(fs.sigma0().square())) {
        return Z.valueOf(mN);
      }
    }
  }
}
