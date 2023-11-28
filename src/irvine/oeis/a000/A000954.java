package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicIntArray;

/**
 * A000954 Conjecturally largest even integer which is an unordered sum of two primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A000954 extends Sequence0 {

  private final Fast mPrime = new Fast();
  protected final LongDynamicIntArray mCount = new LongDynamicIntArray();
  protected long mPrev = 2;
  private long mP = 2;
  protected long mN = -1;

  {
    mCount.set(2, 1); // i.e. 2+2 = 4, only even number involving sum of 2
  }

  protected void update() {
    long p = mP;
    final long lim = 10000 + 2 * mPrev; // heuristic distance to search
    while ((p = mPrime.nextPrime(p)) < lim) {
      long q = 2;
      while ((q = mPrime.nextPrime(q)) <= p) {
        // divide by 2 since we only care about even numbers
        mCount.increment((p + q) / 2);
      }
      mP = p;
    }
    ++mN;
  }

  @Override
  public Z next() {
    update();
    for (long k = mCount.length() / 2; k > 0; --k) {
      if (mCount.get(k) == mN) {
        mPrev = 2 * k;
        return Z.valueOf(mPrev);
      }
    }
    throw new UnsupportedOperationException();
  }
}

