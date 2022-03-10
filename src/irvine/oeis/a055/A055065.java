package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A055065 Smallest even number that is the sum of distinct primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A055065 implements Sequence {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long v = -1;
    long w = -2;
    while (true) {
      ++v;
      w += 2;
      while (w > mP) {
        mP = mPrime.nextPrime(mP);
        for (long q = 3; q < mP; q = mPrime.nextPrime(q)) {
          final long s = (mP + q) >>> 1;
          mCount.set(s, mCount.get(s) + 1);
        }
      }
      if (mCount.get(v) == mN) {
        return Z.valueOf(w);
      }
    }
  }
}
