package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066154 Numbers k such that EulerPhi(k) = sigma(k) - sigma(k-1).
 * @author Sean A. Irvine
 */
public class A066154 extends Sequence1 {

  private long mN = 573;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(mN - 1);
      if (fs0.phi().equals(fs0.sigma().subtract(fs1.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
