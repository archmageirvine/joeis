package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034302 Zeroless primes that remain prime if any digit is deleted.
 * @author Sean A. Irvine
 */
public class A034302 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 22;

  private boolean isDelPrime(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      if (!mPrime.isPrime(Long.parseLong(s.substring(0, k) + s.substring(k + 1)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final String s = String.valueOf(mP);
      if (!s.contains("0") && isDelPrime(s)) {
        return Z.valueOf(mP);
      }
    }
  }
}
