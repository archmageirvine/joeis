package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055940 Counterbalanced numbers: Composite numbers k such that phi(k)/(sigma(k)-k) is an integer.
 * @author Sean A. Irvine
 */
public class A055940 implements Sequence {

  private long mN = 131;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Cheetah.factor(mN);
      if (fs.bigOmega() > 1 && fs.phi().mod(fs.sigma().subtract(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
