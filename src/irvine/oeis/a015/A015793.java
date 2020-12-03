package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015793 Numbers n such that phi(n) + 4 divides sigma(n).
 * @author Sean A. Irvine
 */
public class A015793 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(4)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
