package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055650 Numbers k such that k | phi(k)*d(k) - sigma(k), where phi=A000010, d=A000005 and sigma=A000203.
 * @author Sean A. Irvine
 */
public class A055650 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.phi().multiply(fs.sigma0()).subtract(fs.sigma()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

