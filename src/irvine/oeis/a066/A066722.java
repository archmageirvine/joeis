package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066722 extends Sequence1 {

  private final long mWays;
  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected A066722(final long ways) {
    mWays = ways;
  }

  /** Construct the sequence. */
  public A066722() {
    this(6);
  }

  private boolean is(final long n) {
    long cnt = 0;
    for (long p = 3; 2 * p <= n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(n - p) && ++cnt > mWays) {
        return false;
      }
    }
    return cnt == mWays;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
