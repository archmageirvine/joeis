package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069220 Denominator of Sum_{1&lt;=k&lt;=n, gcd(k,n)=1} 1/k.
 * @author Sean A. Irvine
 */
public class A069220 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add(new Q(1, k));
      }
    }
    return select(sum);
  }
}

