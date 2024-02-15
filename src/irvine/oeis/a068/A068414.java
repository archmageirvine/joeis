package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068414 Numbers k such that sigma(k) = 3k - 2*phi(k).
 * @author Sean A. Irvine
 */
public class A068414 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Z.valueOf(3 * mN).subtract(fs.phi().multiply2()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

