package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076516 Primes p such that (p-1) and the period length of 1/p are both squares.
 * @author Sean A. Irvine
 */
public class A076516 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Predicates.SQUARE.is(mP.subtract(1)) && Predicates.SQUARE.is(new IntegersModMul(mP).order(Z.TEN))) {
        return mP;
      }
    }
  }
}
