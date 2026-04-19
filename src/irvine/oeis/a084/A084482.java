package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084482 Primes base 10 that remain primes in all nine bases b, 2&lt;=b&lt;=10, when the expansions are interpreted as decimal numbers.
 * @author Sean A. Irvine
 */
public class A084482 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 50006393430L;

  private boolean is(final long n) {
    final long r4 = n & 3;
    if (r4 != 1 && r4 != 3) {
      return false;
    }
    if (n % 3 != 1) {
      return false;
    }
    if (n % 6 != 1) {
      return false;
    }
    final long r7 = n % 7;
    if (r7 != 1 && r7 != 3) {
      return false;
    }
    final long r9 = n % 9;
    if (r9 != 1 && r9 != 7) {
      return false;
    }
    for (int b = 9; b >= 2; --b) {
      if (!new Z(Long.toString(n, b)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
