package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072859 Primes p for which the period of 1/p is prime.
 * @author Sean A. Irvine
 */
public class A072859 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (new IntegersModMul(mP).order(Z.TEN).isProbablePrime()) {
        return mP;
      }
    }
  }
}
