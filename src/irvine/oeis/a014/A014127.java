package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014127 Mirimanoff primes: primes p such that p^2 divides 3^(p-1) <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A014127 implements Sequence {

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
