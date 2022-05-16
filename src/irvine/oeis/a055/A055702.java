package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055702 Numbers n such that n | Sigma_8(n) + Phi(n)^8.
 * @author Sean A. Irvine
 */
public class A055702 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(8).add(fs.phi().pow(8)).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
