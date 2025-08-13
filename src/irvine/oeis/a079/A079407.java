package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079407 Numbers m such that the least s &gt;= 0 such that Sum_{k=0..m} (k+s)!/C(m,k) is an integer satisfies s = m - 1.
 * @author Sean A. Irvine
 */
public class A079407 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int n, final long s) {
    return !Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(k + s), Binomial.binomial(n, k))).isInteger();
  }

  private boolean is(final int n) {
    int s = 0;
    while (is(n, s)) {
      ++s;
    }
    return n - s == 1;
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
