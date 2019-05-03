package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020491 Numbers k such that <code>sigma_0(k)</code> divides <code>phi(k)</code>.
 * @author Sean A. Irvine
 */
public class A020491 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.phi().mod(fs.sigma0()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
