package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015798 Numbers k such that phi(k) + 7 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015798 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(7)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
