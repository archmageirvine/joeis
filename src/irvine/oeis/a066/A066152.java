package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066152 Numbers k such that EulerPhi(k) = sigma(k+1) - sigma(k).
 * @author Sean A. Irvine
 */
public class A066152 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(mN + 1);
      if (fs0.phi().equals(fs1.sigma().subtract(fs0.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
