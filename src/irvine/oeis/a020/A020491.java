package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020491 Numbers k such that sigma_0(k) divides phi(k).
 * @author Sean A. Irvine
 */
public class A020491 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.phi().mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
