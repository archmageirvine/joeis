package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A087104 Greatest jumping champion for prime(n).
 * @author Sean A. Irvine
 */
public class A087104 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mP = 2;
  private long mMax = 0;

  @Override
  public Z next() {
    final long q = mP;
    mP = mPrime.nextPrime(mP);
    final long gap = mP - q;
    final long c = mCounts.increment(gap - 1);
    if (c > mMax) {
      mMax = c;
    }
    for (long k = mCounts.length() - 1; k >= 0; --k) {
      if (mCounts.get(k) == mMax) {
        return Z.valueOf(k + 1);
      }
    }
    throw new RuntimeException();
  }
}
