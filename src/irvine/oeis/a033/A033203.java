package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A033203 Primes p congruent to {1, 2, 3} mod 8; or primes p of form x^2+2*y^2; or primes p such that x^2 = -2 has a solution mod p.
 * @author Sean A. Irvine
 */
public class A033203 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(8);
      if (r == 1 || r == 2 || r == 3) {
        return mP;
      }
    }
  }
}

