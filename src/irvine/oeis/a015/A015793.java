package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015793 Numbers n such that phi(n) + 4 divides sigma(n).
 * @author Sean A. Irvine
 */
public class A015793 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(4)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
