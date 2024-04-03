package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069083 Numbers n such that sigma(n)/tau(n) has denominator 4.
 * @author Sean A. Irvine
 */
public class A069083 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Z.FOUR.equals(new Q(fs.sigma(), fs.sigma0()).den())) {
        return Z.valueOf(mN);
      }
    }
  }
}

