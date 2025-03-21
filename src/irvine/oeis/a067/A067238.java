package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067238 Numbers k such that sigma(k) = bigomega(k) * phi(k).
 * @author Sean A. Irvine
 */
public class A067238 extends Sequence1 {

  private long mN = 34;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().multiply(fs.bigOmega()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
