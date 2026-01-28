package irvine.oeis.a389;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A389272 allocated for Leo Hennig.
 * @author Sean A. Irvine
 */
public class A389272 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mSums = new LongDynamicLongArray();
  private long mP = 1;
  private long mM = 10;

  @Override
  public Z next() {
    // This is significantly faster than dynamically creating sums downward from mP
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP > mM) {
        mM *= 10;
      }
      final long len = mSums.length();
      for (long k = 0; k <= len; ++k) {
        mSums.add(k, mP);
      }
      long m = mM;
      for (long k = mSums.length() - 1; k >= 0; --k) {
        final long s = mSums.get(k);
        while (s > m) {
          m *= 10;
        }
        if (s == m) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}
