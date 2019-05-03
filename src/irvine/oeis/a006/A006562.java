package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006562 Balanced primes (of order <code>one)</code>: primes which are the average of the previous prime and the following prime.
 * @author Sean A. Irvine
 */
public class A006562 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z prev = mP;
      mP = mPrime.nextPrime(mP);
      if (prev.add(mPrime.nextPrime(mP)).equals(mP.multiply2())) {
        return mP;
      }
    }
  }
}
