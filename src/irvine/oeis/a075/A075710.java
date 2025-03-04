package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075697.
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
