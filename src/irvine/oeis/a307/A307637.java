package irvine.oeis.a307;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307637 allocated for Donghwi Park.
 * @author Sean A. Irvine
 */
public class A307637 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 293999;

  private boolean isIsolatedPrime(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k + 1);
      final int c = s.charAt(k) - '0';
      for (int d = k > 0 ? 0 : 1; d < 10; ++d) {
        if (d != c) {
          final long candidate = Long.parseLong(left + d + right);
          if (mPrime.isPrime(candidate)) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final String s = String.valueOf(mP);
      if (isIsolatedPrime(s)) {
        return Z.valueOf(mP);
      }
    }
  }
}
