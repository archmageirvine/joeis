package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A046903 Largest odd number that can be represented in no more than n ways as p + 2*i^2 where p is 1 or a prime and i &gt;= 0.
 * @author Sean A. Irvine
 */
public class A046903 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mLast = new DynamicLongArray();
  private int mN = -1;
  private long mM = 1;
  private long mPrev = 0;

  private int ways(final long n) {
    int cnt = 0;
    for (long k = 0, p; (p = n - 2 * k * k) > 0; ++k) {
      if (p == 1 || mPrime.isPrime(p)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    // HEURISTICS
    while (mLast.get(mN) > mM / 10 - 1000) {
      final int ways = ways(mM);
      if (ways < mN) {
        throw new RuntimeException("Heuristic violation detected, a(" + ways + ") >= " + mM);
      }
      mLast.set(ways, mM);
      mM += 2;
    }
    mPrev = Math.max(mPrev, mLast.get(mN));
    return Z.valueOf(mPrev);
  }
}
