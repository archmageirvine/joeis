package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A266780.
 * @author Sean A. Irvine
 */
public class A069258 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long[] mCounts = {};
  private int mN = 1;
  private int mM = 0;

  private void search(final long remaining, final long p, final int parts) {
    if (remaining == 0) {
      ++mCounts[parts];
      return;
    }
    for (long q = Math.min(p, mPrime.prevPrime(remaining + 1)); q > 1; q = mPrime.prevPrime(q)) {
      search(remaining - q, q, parts + 1);
    }
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length - 1) {
      final long t = 2L * ++mN;
      mCounts = new long[mN + 1];
      search(t, mPrime.prevPrime(t + 1), 0);
      mM = 1;
    }
    return Z.valueOf(mCounts[mCounts.length - mM]);
  }
}
