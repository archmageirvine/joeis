package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067766 Numbers n such that sigma(n)^2&gt;4*sigma_2(n) where sigma_2(n) is the sum of squares over the divisors of n.
 * @author Sean A. Irvine
 */
public class A067766 extends Sequence1 {

  private long mN = 23;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().square().compareTo(fs.sigma2().multiply(4)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
