package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036334 Number of composite numbers whose juxtaposition of prime factors has length n.
 * @author Sean A. Irvine
 */
public class A036334 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mCount = 0;

  private void count(final int limit, final long p, final long product, final int length) {
    if (length == limit) {
      if (!mPrime.isPrime(product)) {
        ++mCount;
      }
      return;
    }
    int lq;
    for (long q = p; (lq = length + String.valueOf(q).length()) <= limit; q = mPrime.nextPrime(q)) {
      count(limit, q, product * q, lq);
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    count(++mN, 2, 1, 0);
    return Z.valueOf(mCount);
  }
}
