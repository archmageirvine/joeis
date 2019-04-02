package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003630 Inert rational primes in Q[sqrt(3)].
 * @author Sean A. Irvine
 */
public class A003630 implements Sequence {

  private Z mP = Z.THREE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z m = mP.subtract(1);
      if (m.equals(Z.THREE.modPow(m.divide2(), mP))) {
        return mP;
      }
    }
  }
}
