package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014127 Mirimanoff primes: primes p such that p^2 divides 3^(p-1) - 1.
 * @author Sean A. Irvine
 */
public class A014127 extends Sequence1 {

  // This is not really recommended, there are two easy terms, then it is currently
  // unknown where (if any) the next term occurs.  Certainly longer than you would
  // want to wait with this code.

  private final Fast mPrime = new Fast();
  private Z mP = Z.SEVEN;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z p2 = mP.square();
      if (Z.ONE.equals(Z.THREE.modPow(mP.subtract(1), p2))) {
        return mP;
      }
    }
  }
}
