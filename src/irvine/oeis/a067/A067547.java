package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067547 Number of divisors of n equals the average of distinct prime factors of n.
 * @author Sean A. Irvine
 */
public class A067547 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(fs.omega()).equals(fs.sopf())) {
        return Z.valueOf(mN);
      }
    }
  }
}
