package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.IntegersModMul;
import irvine.factor.prime.Fast;

/**
 * A002371 Period of decimal expansion of <code>1/(n-th prime) (0</code> by convention for the primes 2 and <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A002371 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.TWO.equals(mP) || Z.FIVE.equals(mP)) {
      return Z.ZERO;
    }
    final IntegersModMul r = new IntegersModMul(mP);
    return r.order(Z.TEN.mod(mP));
  }
}
