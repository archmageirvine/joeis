package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065822 Numbers k such that 5*phi(k) = 4*sigma(k).
 * @author Sean A. Irvine
 */
public class A065822 extends Sequence1 {

  private long mN = 322;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(5).equals(fs.sigma().multiply(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}

