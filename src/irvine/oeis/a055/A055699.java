package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055699 Numbers n such that n | (sigma_5(n) - phi(n)^5).
 * @author Sean A. Irvine
 */
public class A055699 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(5).subtract(fs.phi().pow(5)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
