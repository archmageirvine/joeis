package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068540 Numbers k such that phi(k) = bigomega(k)*tau(k)^2.
 * @author Sean A. Irvine
 */
public class A068540 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(fs.sigma0().square().multiply(fs.bigOmega()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
