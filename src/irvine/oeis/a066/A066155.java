package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066155 Numbers k such that EulerPhi(k) = sigma(k+1) - sigma(k-1).
 * @author Sean A. Irvine
 */
public class A066155 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs1 = Jaguar.factor(++mN + 1);
      final FactorSequence fs2 = Jaguar.factor(mN - 1);
      if (Euler.phi(mN).equals(fs1.sigma().subtract(fs2.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
