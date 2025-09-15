package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A080362 a(n) is the number of positive integers x such that the number of unitary-prime-divisors of x! equals n. Same as the number of positive integers x such that the number of primes in (x/2,x] equals n.
 * @author Sean A. Irvine
 */
public class A080362 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;
  private long mQ = 2;

  @Override
  public Z next() {
    ++mN;
    mQ = mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(mQ))); // Laishram's theorem
    while (mM <= 2 * mQ) {
      ++mM;
      long cnt = 0;
      for (long p = mPrime.nextPrime(mM / 2); p <= mM; p = mPrime.nextPrime(p)) {
        ++cnt;
      }
      if (cnt > 0 && cnt < mN) {
        throw new RuntimeException("Previously reported value for " + cnt + " was incorrect.");
      }
      mCount.increment(cnt);
    }
    return Z.valueOf(mCount.get(mN));
  }
}
