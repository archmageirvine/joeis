package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055703 Numbers n such that n | sigma_9(n) - phi(n)^9.
 * @author Sean A. Irvine
 */
public class A055703 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(9).subtract(fs.phi().pow(9)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
