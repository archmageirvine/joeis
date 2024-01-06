package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067781 Numbers n such that phi(n) and sigma(n) are simultaneously perfect squares.
 * @author Sean A. Irvine
 */
public class A067781 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().isSquare() && fs.phi().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
