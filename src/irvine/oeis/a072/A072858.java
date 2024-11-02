package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072858 Primes p such that the period of the decimal expansion of 1/p is a square.
 * @author Sean A. Irvine
 */
public class A072858 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.TWO.equals(mP) || Z.FIVE.equals(mP)) {
        return mP;
      }
      if (Predicates.SQUARE.is(new IntegersModMul(mP).order(Z.TEN))) {
        return mP;
      }
    }
  }
}
