package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062699 Numbers n such that sigma(n) = 2*phi(n).
 * @author Sean A. Irvine
 */
public class A062699 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
