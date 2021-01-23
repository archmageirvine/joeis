package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020492 Balanced numbers: numbers n such that phi(n) (A000010) divides sigma(n) (A000203).
 * @author Sean A. Irvine
 */
public class A020492 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
