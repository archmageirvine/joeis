package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015797 Numbers n such that phi(n) + 6 | sigma(n).
 * @author Sean A. Irvine
 */
public class A015797 implements Sequence {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(6)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
