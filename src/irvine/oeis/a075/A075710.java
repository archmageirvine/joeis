package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075710 Numerator of Sum_{k=1..n} frac(n/k), where frac(x/y) denotes the fractional part of x/y.
 * @author Sean A. Irvine
 */
public class A075710 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(new Q(mN % k, k));
    }
    return sum.num();
  }
}
