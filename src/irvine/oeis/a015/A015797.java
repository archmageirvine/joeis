package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015797 Numbers n such that phi(n) + 6 | sigma(n).
 * @author Sean A. Irvine
 */
public class A015797 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(6)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
