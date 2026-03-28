package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A393525 Consider the following transformation of prime numbers: If b(n) == 1 (mod 4) then b(n+1) = (b(n) + 1)/2. If b(n) == 3 (mod 4) then b(n+1) = (b(n) - 1)/2. Continue this transformation until a nonprime is reached. a(n) is the least prime number such that exactly n primes appear in the chain of numbers created by this transformation.
 * @author Sean A. Irvine
 */
public class A393525 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private int mN = 0;

  // If b(n) == 1 (mod 4) then b(n+1) = (b(n) + 1)/2. If b(n) == 3 (mod 4) then b(n+1) = (b(n) - 1)/2. Continue this transformation until a nonprime is reached.
  private int count(long n) {
    int cnt = 0;
    while (mPrime.isPrime(n)) {
      n = (n & 3) == 1 ? ((n + 1) >>> 1) : ((n - 1) >>> 1);
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final int len = count(mP);
      if (mFirsts.get(len) == 0) {
        mFirsts.set(len, mP);
        if (mVerbose) {
          StringUtils.message("Solution for " + len + " is " + mP);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
