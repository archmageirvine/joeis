package irvine.oeis.a096;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A096710 Quadruply balanced primes: primes which are averages of their immediate neighbor primes, their second neighbor primes, their third neighbor primes and their fourth neighbor primes.
 * @author Sean A. Irvine
 */
public class A096710 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP0 = Z.valueOf(98303867);
  private Z mP1 = mPrime.nextPrime(mP0);
  private Z mP2 = mPrime.nextPrime(mP1);
  private Z mP3 = mPrime.nextPrime(mP2);

  @Override
  public Z next() {
    while (true) {
      final Z prev = mP0;
      mP0 = mP1;
      mP1 = mP2;
      mP2 = mP3;
      mP3 = mPrime.nextPrime(mP3);
      final Z next1 = mPrime.nextPrime(mP3);
      final Z next2 = mPrime.nextPrime(next1);
      final Z next3 = mPrime.nextPrime(next2);
      if (mP2.add(next1).equals(mP3.multiply2())
        && mP1.add(next2).equals(mP3.multiply2())
        && mP0.add(next3).equals(mP3.multiply2())
        && prev.add(mPrime.nextPrime(next3)).equals(mP3.multiply2())) {
        return mP3;
      }
    }
  }
}
