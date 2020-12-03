package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015774 Numbers k such that phi(k) | sigma_15(k).
 * @author Sean A. Irvine
 */
public class A015774 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(15).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
