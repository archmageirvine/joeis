package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079412 Number of ways to write n as sum of prime powers p^e such that e&gt;0 and p does not divide n.
 * @author Sean A. Irvine
 */
public class A079412 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mCount = 0;

  private void search(final long n, final long m, long p) {
    if (m == 0) {
      ++mCount;
      return;
    }
    while (p <= m) {
      if (n % p != 0) {
        for (long q = p; q <= m; q *= p) {
          search(n, m - q, p);
        }
      }
      p = mPrime.nextPrime(p);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(mN, mN, 2);
    return Z.valueOf(mCount);
  }
}

