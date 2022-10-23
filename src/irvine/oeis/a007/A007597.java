package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007597 Strobogrammatic primes.
 * @author Sean A. Irvine
 */
public class A007597 extends Sequence1 {

  private static final char[] STROBO = {'0', '1', 'x', 'x', 'x', 'x', '9', 'x', '8', '6'};
  private final Fast mPrime = new Fast();
  private Z mP = Z.NINE;

  private boolean isStrobogrammatic(final String s) {
    final int n = s.length();
    for (int k = 0; k < (n + 1) / 2; ++k) {
      if (s.charAt(k) != STROBO[s.charAt(n - k - 1) - '0']) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isStrobogrammatic(mP.toString())) {
        return mP;
      }
    }
  }
}
