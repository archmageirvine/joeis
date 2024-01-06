package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067706 Numbers k such that phi(sigma(k)) = 3*phi(k).
 * @author Sean A. Irvine
 */
public class A067706 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Euler.phi(fs.sigma()).equals(fs.phi().multiply(3))) {
        return Z.valueOf(mN);
      }
    }
  }
}
