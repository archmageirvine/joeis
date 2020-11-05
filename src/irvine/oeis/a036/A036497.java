package irvine.oeis.a036;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A036497 Number of partitions of n into distinct primes (counting 1 as a prime).
 * @author Sean A. Irvine
 */
public class A036497 extends A008578 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  private int mP = 0;
  private Polynomial<Z> mPoly = RING.one();

  @Override
  public Z next() {
    ++mN;
    while (mN > mP) {
      mP = super.next().intValueExact();
      mPoly = RING.multiply(mPoly, RING.onePlusXToTheN(mP));
    }
    return mPoly.coeff(mN);
  }
}

