package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077764 Number of ways of pairing the even squares of the numbers 1 to n with the odd squares of the numbers n+1 to 2n such that each pair sums to a prime. a(1) is defined to be 1.
 * @author Sean A. Irvine
 */
public class A077764 extends Sequence1 {

  private int mN = -1;
  private long mCount = 0;
  private boolean[] mUsed = null;

  private void search(final int k) {
    if (k > mN) {
      ++mCount;
      return;
    }
    final long k2 = (long) (k + 1) * (k + 1);
    for (int j = 1 - (mN & 1); j < mUsed.length; j += 2) {
      if (!mUsed[j]) {
        final long i = mN + 2 + j;
        final long i2 = i * i;
        if (Predicates.PRIME.is(k2 + i2)) {
          mUsed[j] = true;
          search(k + 2);
          mUsed[j] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mUsed = new boolean[mN + 1];
    mCount = 0;
    search(1);
    return Z.valueOf(mCount);
  }
}

