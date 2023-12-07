package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066722 Numbers that can be expressed as the sum of two primes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A066722 extends Sequence1 {

  private final long mWays;
  private final long mAdd;
  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected A066722(final long ways) {
    mWays = ways;
    mAdd = (ways & 1) == 0 ? 2 : 1;
  }

  /** Construct the sequence. */
  public A066722() {
    this(6);
  }

  private boolean is(final long n) {
    long cnt = 0;
    for (long p = 2; 2 * p <= n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(n - p) && ++cnt > mWays) {
        return false;
      }
    }
    return cnt == mWays;
  }

  @Override
  public Z next() {
    while (true) {
      mN += mAdd;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
