package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055706 Numbers n such that n | sigma_12(n) + phi(n)^12.
 * @author Sean A. Irvine
 */
public class A055706 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(12).add(fs.phi().pow(12)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
