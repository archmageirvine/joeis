package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055697 Numbers k such that k | sigma_3(k) - phi(k)^3.
 * @author Sean A. Irvine
 */
public class A055697 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(3).subtract(fs.phi().pow(3)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
