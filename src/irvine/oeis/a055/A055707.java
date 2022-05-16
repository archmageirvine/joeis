package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055707 Numbers k such that k | sigma_13(k) - phi(k)^13.
 * @author Sean A. Irvine
 */
public class A055707 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(13).subtract(fs.phi().pow(13)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
