package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015805 Numbers k such that phi(k) + 12 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015805 extends Sequence1 {

  private long mN = 23;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(12)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
