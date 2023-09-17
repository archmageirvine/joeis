package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065818 Numbers k such that 3*phi(k) = 2*sigma(k).
 * @author Sean A. Irvine
 */
public class A065818 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(3).equals(fs.sigma().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}

