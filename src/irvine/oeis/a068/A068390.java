package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068390 Numbers k such that sigma(k) = 4*phi(k).
 * @author Sean A. Irvine
 */
public class A068390 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().multiply(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
