package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077129 Smallest number which is relatively prime to all the numbers between successive odd primes.
 * @author Sean A. Irvine
 */
public class A077129 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = mPrime.nextPrime(mP);
    long r = 2;
    while (true) {
      r = mPrime.nextPrime(r);
      boolean ok = true;
      for (long c = mP + 1; c < q; ++c) {
        if (c % r == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(r);
      }
    }
  }
}

