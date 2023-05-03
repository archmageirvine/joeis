package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063532 Numbers k such that phi(k) + 1 = x^2 and sigma(k) + 1 = y^2 for some x and y.
 * @author Sean A. Irvine
 */
public class A063532 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().add(1).isSquare() && fs.phi().add(1).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
