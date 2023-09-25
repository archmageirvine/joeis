package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065978 For even k &gt;= 4, let f(k) = A066285(k/2) be the minimal difference between primes p and q whose sum is k. Such a k is in the sequence if f(k) &gt; f(m) for all even m with 4 &lt;= m &lt; k.
 * @author Sean A. Irvine
 */
public class A065978 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 2;
  private long mMax = -1;

  private long f(final long n) {
    for (long p = mPrime.prevPrime(n / 2 + 1); p > 0; p = mPrime.prevPrime(p)) {
      if (mPrime.isPrime(n - p)) {
        return n - 2 * p;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long f = f(mN);
      if (f > mMax) {
        mMax = f;
        return Z.valueOf(mN);
      }
    }
  }
}

