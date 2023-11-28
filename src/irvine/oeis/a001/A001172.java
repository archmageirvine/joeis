package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A001172 Smallest even number that is an unordered sum of two odd primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A001172 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mP = 2;
  private long mN = -1;

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
        for (long q = 3; q <= mP; q = mPrime.nextPrime(q)) {
          mCount.increment((mP + q) >>> 1);
        }
      }
      if (mCount.get(v) == mN) {
        return Z.valueOf(w);
      }
    }
  }
}
