package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074266 Numbers k such that the harmonic mean of the divisors of k is the square of a rational number.
 * @author Sean A. Irvine
 */
public class A074266 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (new Q(fs.sigma0().multiply(mN), fs.sigma()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
