package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023898 Divisor balance of n is an integer.
 * @author Sean A. Irvine
 */
public class A023898 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      Q sum = Q.ZERO;
      for (final Z d : fs.divisors()) {
        sum = sum.add(new Q(d, Euler.phi(d)));
      }
      if (sum.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

