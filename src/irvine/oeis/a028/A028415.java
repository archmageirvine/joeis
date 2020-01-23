package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028415 Numerator of <code>Sum_{k=1..n} 1/phi(k)</code>.
 * @author Sean A. Irvine
 */
public class A028415 implements Sequence {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  protected Z select(final Q sum) {
    return sum.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1L, LongUtils.phi(++mN)));
    return select(mSum);
  }
}
