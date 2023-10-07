package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066286 For even n&gt;=4, let f(n)=A066285(n/2) be the minimal difference between primes p and q whose sum is n. This sequence contains the successive maxima of f.
 * @author Sean A. Irvine
 */
public class A066286 extends Sequence1 {

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
        return Z.valueOf(f);
      }
    }
  }
}

