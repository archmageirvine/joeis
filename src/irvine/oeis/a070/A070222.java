package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070222 Numbers k such that the sum of prime divisors of k divides the sum of divisors of k.
 * @author Sean A. Irvine
 */
public class A070222 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.sopf()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

