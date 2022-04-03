package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055700 Numbers n such that n | Sigma_6(n) + Phi(n)^6.
 * @author Sean A. Irvine
 */
public class A055700 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(6).add(fs.phi().pow(6)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
