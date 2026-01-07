package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083059 extends AbstractSequence {

  // After Andrew Howroyd

  private final Fast mPrime = new Fast();
  private long mN = 4;

  /** Construct the sequence. */
  public A083059() {
    super(5);
  }

  private long b(final long n) {
    for (long p = mPrime.nextPrime(n); p < 2 * n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(2 * n - p)) {
        return p;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    long cnt = 0;
    if (mPrime.isPrime(++mN)) {
      for (long k = mN / 2 + 1; k < mN; ++k) {
        if (b(k) == mN) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

