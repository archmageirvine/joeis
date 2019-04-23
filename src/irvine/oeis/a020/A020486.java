package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020486.
 * @author Sean A. Irvine
 */
public class A020486 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma2().mod(fs.sigma0()) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
