package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079014 a(n) is the least prime initiating consecutive prime difference pattern consisting of n increasing consecutive powers of 2 started with 2.
 * @author Sean A. Irvine
 */
public class A079014 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mP = 2;

  private boolean is(final long p, final long n) {
    long q = p;
    for (long k = 0, d = 2; k < n; ++k, d += 1L << (k + 1)) {
      q = mPrime.nextPrime(q);
      if (q - p != d) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mP, mN)) {
        return Z.valueOf(mP);
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}
