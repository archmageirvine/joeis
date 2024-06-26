package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023898 Numbers whose divisor balance is an integer.
 * @author Sean A. Irvine
 */
public class A023898 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Q sum = Q.ZERO;
      for (final Z d : fs.divisors()) {
        sum = sum.add(new Q(d, Functions.PHI.z(d)));
      }
      if (sum.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

