package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058362 Initial primes of sets of 6 consecutive primes in arithmetic progression.
 * @author Sean A. Irvine
 */
public class A058362 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 121174810;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % 14 == 9) {
        long q = mPrime.nextPrime(mP);
        final long d = q - mP;
        boolean ok = true;
        for (int k = 2; k < 6; ++k) {
          if (mPrime.nextPrime(q) != q + d) {
            ok = false;
            break;
          }
          q += d;
        }
        if (ok) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}
