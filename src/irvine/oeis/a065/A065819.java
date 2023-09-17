package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065819 Numbers k such that 4*phi(k) = 3*sigma(k).
 * @author Sean A. Irvine
 */
public class A065819 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(4).equals(fs.sigma().multiply(3))) {
        return Z.valueOf(mN);
      }
    }
  }
}

