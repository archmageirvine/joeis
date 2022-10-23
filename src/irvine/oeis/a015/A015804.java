package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015804 Numbers k such that phi(k) + 11 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015804 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(11)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
