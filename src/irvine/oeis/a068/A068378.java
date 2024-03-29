package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068378 Numbers n such that sigma(n)^2 &gt; 9*sigma_2(n) where sigma_2(n) is the sum of squares over the divisors of n.
 * @author Sean A. Irvine
 */
public class A068378 extends Sequence1 {

  private long mN = 5039;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().square().compareTo(fs.sigma2().multiply(9)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
