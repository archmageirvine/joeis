package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A393453 Integers k, not divisible by any of their digits, such that k = Sum_{j = digits of k} k/j.
 * @author Sean A. Irvine
 */
public class A393453 extends Sequence1 {

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
    return sum.isInteger() && sum.toZ().equals(t);
  }

  @Override
  public Z next() {
    if (mN == 99999669) {
      return null;
    }
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

