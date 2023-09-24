package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065823 Numbers k such that 6*phi(k) = 5*sigma(k).
 * @author Sean A. Irvine
 */
public class A065823 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(6).equals(fs.sigma().multiply(5))) {
        return Z.valueOf(mN);
      }
    }
  }
}

