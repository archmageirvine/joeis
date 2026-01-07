package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083060 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 3;
  private long mP = 1;

  private long b(final long n) {
    long p = mPrime.nextPrime(n);
    while (true) {
      if (mPrime.isPrime(2 * n - p)) {
        return p;
      }
      p = mPrime.nextPrime(p);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    while (mM < mP) {
      mCounts.increment(Functions.PRIME_PI.l(b(++mM)));
    }
    return Z.valueOf(mCounts.get(mN));
  }
}

