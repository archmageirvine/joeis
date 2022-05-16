package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049645 Numbers k such that the square of the number of divisors of k divides the sum of the divisors of k.
 * @author Sean A. Irvine
 */
public class A049645 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.sigma0().square()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
