package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A006962 Supersingular primes of the elliptic curve X_0 (11).
 * @author Sean A. Irvine
 */
public class A006962 extends A006571 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (mPrime.isPrime(mN) && t.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
