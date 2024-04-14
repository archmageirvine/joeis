package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069234 Numbers k such that the sum over the prime divisors of k equals the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A069234 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sopf().equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}

