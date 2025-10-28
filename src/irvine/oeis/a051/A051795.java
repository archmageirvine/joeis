package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051795 Doubly balanced primes: primes which are averages of both their immediate and their second neighbors.
 * @author Sean A. Irvine
 */
public class A051795 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP0 = Z.valueOf(18713);
  private Z mP1 = mPrime.nextPrime(mP0);

  @Override
  public Z next() {
    while (true) {
      final Z prev = mP0;
      mP0 = mP1;
      mP1 = mPrime.nextPrime(mP1);
      final Z next = mPrime.nextPrime(mP1);
      if (mP0.add(next).equals(mP1.multiply2())
        && prev.add(mPrime.nextPrime(next)).equals(mP1.multiply2())) {
        return mP1;
      }
    }
  }
}
