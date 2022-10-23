package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022819 a(n) = floor(1/(n-1) + 2/(n-2) + 3/(n-3) + ... + (n-1)/1).
 * @author Sean A. Irvine
 */
public class A022819 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(new Q(mN, k));
    }
    return sum.toZ();
  }
}
