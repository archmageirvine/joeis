package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065986 Numbers n such that Sigma(n) = EulerPhi(n+1) + EulerPhi(n) + EulerPhi(n-1).
 * @author Sean A. Irvine
 */
public class A065986 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().add(Euler.phi(mN + 1)).add(Euler.phi(mN - 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
