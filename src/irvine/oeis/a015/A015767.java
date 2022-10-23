package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015767 Numbers k such that phi(k) | sigma_9(k).
 * @author Sean A. Irvine
 */
public class A015767 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(9).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
