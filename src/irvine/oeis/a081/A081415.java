package irvine.oeis.a081;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081415 Triply balanced primes: primes which are averages of both their immediate neighbor, their second neighbors and their third neighbors.
 * @author Sean A. Irvine
 */
public class A081415 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP0 = Z.valueOf(683747);
  private Z mP1 = mPrime.nextPrime(mP0);
  private Z mP2 = mPrime.nextPrime(mP1);

  @Override
  public Z next() {
    while (true) {
      final Z prev = mP0;
      mP0 = mP1;
      mP1 = mP2;
      mP2 = mPrime.nextPrime(mP2);
      final Z next1 = mPrime.nextPrime(mP2);
      final Z next2 = mPrime.nextPrime(next1);
      if (mP1.add(next1).equals(mP2.multiply2())
        && mP0.add(next2).equals(mP2.multiply2())
        && prev.add(mPrime.nextPrime(next2)).equals(mP2.multiply2())) {
        return mP2;
      }
    }
  }
}
