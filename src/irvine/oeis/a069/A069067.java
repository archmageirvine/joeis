package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069067 Numbers k such that k*tau(k) is a perfect square.
 * @author Sean A. Irvine
 */
public class A069067 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

