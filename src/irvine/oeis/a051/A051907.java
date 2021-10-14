package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051907 Number of ways to express 1 as the sum of distinct unit fractions such that the sum of the denominators is n.
 * @author Sean A. Irvine
 */
public class A051907 implements Sequence {

  private long mN = 0;
  private long mCount = 0;

  private void search(final Q sum, final long remaining, final long prev) {
    if (remaining == 0) {
      if (Q.ONE.equals(sum)) {
        ++mCount;
      }
      return;
    }
    if (Q.ONE.compareTo(sum) > 0) {
      for (long k = Math.min(prev - 1, remaining); k > 0; --k) {
        search(sum.add(new Q(1, k)), remaining - k, k);
      }
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    search(Q.ZERO, ++mN, mN + 1);
    return Z.valueOf(mCount);
  }
}
