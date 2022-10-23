package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023899 Integer values of divisor balance: Sum_{d divides k} {d / phi(d)} for numbers k in A023898.
 * @author Sean A. Irvine
 */
public class A023899 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Q sum = Q.ZERO;
      for (final Z d : fs.divisors()) {
        sum = sum.add(new Q(d, Euler.phi(d)));
      }
      if (sum.isInteger()) {
        return sum.toZ();
      }
    }
  }
}

