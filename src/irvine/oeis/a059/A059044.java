package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059044 Initial primes of sets of 5 consecutive primes in arithmetic progression.
 * @author Sean A. Irvine
 */
public class A059044 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 9843018;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mP);
      final long diff = q - mP;
      final long r = mPrime.nextPrime(q);
      if (r - q == diff) {
        final long s = mPrime.nextPrime(r);
        if (s - r == diff) {
          final long t = mPrime.nextPrime(s);
          if (t - s == diff) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}
