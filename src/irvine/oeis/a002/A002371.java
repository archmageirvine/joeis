package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002371 Period of decimal expansion of 1/(n-th prime) (0 by convention for the primes 2 and 5).
 * @author Sean A. Irvine
 */
public class A002371 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.TWO.equals(mP) || Z.FIVE.equals(mP)) {
      return Z.ZERO;
    }
    return new IntegersModMul(mP).order(Z.TEN);
  }
}
