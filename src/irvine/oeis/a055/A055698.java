package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055698 Numbers n such that n | (sigma_4(n) + phi(n)^4).
 * @author Sean A. Irvine
 */
public class A055698 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(4).add(fs.phi().pow(4)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
