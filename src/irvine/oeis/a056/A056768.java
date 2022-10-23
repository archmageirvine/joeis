package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056768 Number of partitions of the n-th prime into parts that are all primes.
 * @author Sean A. Irvine
 */
public class A056768 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mP = 1;
  private final Fast mPrime = new Fast();
  private Polynomial<Z> mPoly = RING.one();

  @Override
  public Z next() {
    mP = (int) mPrime.nextPrime(mP);
    mPoly = RING.multiply(mPoly, RING.oneMinusXToTheN(mP));
    return RING.coeff(RING.one(), mPoly, mP);
  }
}

