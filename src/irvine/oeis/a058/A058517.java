package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058517 Positive even numbers not of the form prime + 3^x.
 * @author Sean A. Irvine
 */
public class A058517 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    for (long t = 1; t < n; t *= 3) {
      if (mPrime.isPrime(n - t)) {
        return false;
      }
    }
    return true;
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
