package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015796 Numbers k such that phi(k) + 5 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015796 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(5)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
