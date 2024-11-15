package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073082 Numbers n such that sum k/d(k) is an integer, where d(k) is the k-th divisor of n (the divisors of n are in increasing order).
 * @author Sean A. Irvine
 */
public class A073082 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    Q sum = Q.ZERO;
    long k = 0;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      sum = sum.add(new Q(++k, d));
    }
    return sum.isInteger();
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
