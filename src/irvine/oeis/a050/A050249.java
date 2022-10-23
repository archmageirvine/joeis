package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050249 Weakly prime numbers (changing any one decimal digit always produces a composite number). Also called digitally delicate primes.
 * @author Sean A. Irvine
 */
public class A050249 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 294000;

  private boolean isWeakPrime(final long p) {
    final String s = String.valueOf(p);
    for (int k = 0; k < s.length(); ++k) {
      final int d = s.charAt(k) - '0';
      for (int replacement = 0; replacement < 10; ++replacement) {
        if (replacement != d && mPrime.isPrime(Long.parseLong(s.substring(0, k) + replacement + s.substring(k + 1)))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isWeakPrime(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
