package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000607 Number of partitions of n into prime parts.
 * @author Sean A. Irvine
 */
public class A000607 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mP = 1;
  private final Fast mPrime = new Fast();
  private Polynomial<Z> mPoly = RING.one();

  @Override
  public Z next() {
    ++mN;
    while (mN > mP) {
      mP = (int) mPrime.nextPrime(mP);
      mPoly = RING.multiply(mPoly, RING.oneMinusXToTheN(mP));
    }
    return RING.coeff(RING.one(), mPoly, mN);
  }
}

