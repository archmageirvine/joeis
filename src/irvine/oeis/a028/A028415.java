package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028415 Numerator of Sum_{k=1..n} 1/phi(k).
 * @author Sean A. Irvine
 */
public class A028415 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  protected Z select(final Q sum) {
    return sum.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1L, Euler.phiAsLong(++mN)));
    return select(mSum);
  }
}
