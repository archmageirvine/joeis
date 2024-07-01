package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A002371 Period of decimal expansion of 1/(n-th prime) (0 by convention for the primes 2 and 5).
 * @author Sean A. Irvine
 */
public class A002371 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  protected Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.TWO.equals(mP) || Z.FIVE.equals(mP)) {
      return Z.ZERO;
    }
    return new IntegersModMul(mP).order(Z.TEN);
    // return Functions.ORDER.z(mP, Z.TEN);
  }

  @Override
  public Z a(final Z n) {
    if (n.compareTo(Z.THREE) <= 0) {
      return n.and(Z.ONE).xor(Z.ONE);
    }
    return Functions.ORDER.z(Functions.PRIME.i(n), Z.TEN);
  }

  @Override
  public Z a(final int n) {
    if (n <= 3) {
      return Z.valueOf((n & 1) ^ 1);
    }
    return Functions.ORDER.z(Functions.PRIME.i(n), Z.TEN);
  }

}
