package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063785 Numbers n such that sigma(n) = 2n + omega(n), where omega(n) is the number of distinct prime divisors of n.
 * @author Sean A. Irvine
 */
public class A063785 extends Sequence1 {

  private long mN = 19;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Z.valueOf(2 * mN + fs.omega()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
