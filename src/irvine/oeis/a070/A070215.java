package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070215 Number of ways to write the n-th prime as a sum of distinct primes.
 * @author Sean A. Irvine
 */
public class A070215 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mP = 1;
  private final Fast mPrime = new Fast();
  private Polynomial<Z> mPoly = RING.one();

  @Override
  public Z next() {
    mP = (int) mPrime.nextPrime(mP);
    mPoly = RING.multiply(mPoly, RING.onePlusXToTheN(mP));
    return mPoly.coeff(mP);
  }
}

