package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015792 Numbers k such that phi(k) + 3 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015792 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(3)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
