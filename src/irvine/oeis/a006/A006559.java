package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006559 Short period primes: the decimal expansion of 1/p has period less than p-1, but greater than zero.
 * @author Sean A. Irvine
 */
public class A006559 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.ONE.equals(mP.gcd(Z.TEN)) && new IntegersModMul(mP).order(Z.TEN).compareTo(mP.subtract(1)) < 0)  {
        return mP;
      }
    }
  }
}
