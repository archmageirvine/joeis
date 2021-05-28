package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007645 Generalized cuban primes: primes of the form x^2 + xy + y^2; or primes of the form x^2 + 3*y^2; or primes == 0 or 1 (mod 3).
 * @author Sean A. Irvine
 */
public class A007645 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(3) < 2) {
        return mP;
      }
    }
  }
}

