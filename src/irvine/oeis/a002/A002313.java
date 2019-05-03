package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002313 Primes congruent to 1 or 2 modulo 4; or, primes of form <code>x^2 + y^2</code>; or, -1 is a square mod p.
 * @author Sean A. Irvine
 */
public class A002313 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      final long res = mN.and(Z.THREE).longValue();
      if (res == 1 || res == 2) {
        return mN;
      }
    }
  }
}
