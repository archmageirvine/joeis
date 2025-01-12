package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015766 Numbers k such that phi(k) | sigma_8(k).
 * @author Sean A. Irvine
 */
public class A015766 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(8).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
