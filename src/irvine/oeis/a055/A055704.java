package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055704 Numbers k such that n | sigma_10(k) + phi(k)^10.
 * @author Sean A. Irvine
 */
public class A055704 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(10).add(fs.phi().pow(10)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
