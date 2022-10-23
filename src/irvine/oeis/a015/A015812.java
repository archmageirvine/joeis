package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015812 Composite numbers k such that phi(k) + 2 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015812 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1 && fs.sigma().mod(fs.phi().add(2)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
