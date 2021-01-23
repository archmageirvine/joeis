package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028416 Primes p such that the decimal expansion of 1/p has a periodic part of even length.
 * @author Sean A. Irvine
 */
public class A028416 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (new IntegersModMul(mP).order(Z.TEN).isEven()) {
        return mP;
      }
    }
  }
}
