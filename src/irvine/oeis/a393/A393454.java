package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A393454 Integers k, not divisible by any of their digits, such that Sum_{j = digits of k} k/j is an integer different from k.
 * @author Sean A. Irvine
 */
public class A393454 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long t) {
    final int[] cnts = ZUtils.digitCounts(t);
    if (cnts[0] > 0) {
      return false;
    }
    Q sum = Q.ZERO;
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        if (mN % k == 0) {
          return false;
        }
        sum = sum.add(new Q(mN * cnts[k], k));
      }
    }
    return sum.isInteger() && !sum.toZ().equals(t);
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

