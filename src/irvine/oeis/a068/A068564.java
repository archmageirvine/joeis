package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068564 Numbers k such that phi(k) = 2*tau(k)^2.
 * @author Sean A. Irvine
 */
public class A068564 extends Sequence1 {

  private long mN = 50;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(fs.sigma0().square().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
