package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058358 Coefficients in the series (1 + x + 4x^4 + 6x^6 + 8x^8 + 9x^9 + 10x^10 + 12x^12 + 14x^14 + ... )/(1 - 2x^2 - 3x^3 - 5x^5 - 7x^7 - 11x^11 - 13x^13 - ... ).
 * @author Sean A. Irvine
 */
public class A058358 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private final Polynomial<Z> mNum = RING.onePlusXToTheN(1);
  private final Polynomial<Z> mDen = RING.empty();
  {
    mDen.add(Z.ONE);
  }
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mPrime.isPrime(mN)) {
        while (mDen.size() < mN) {
          mDen.add(Z.ZERO);
        }
        mDen.add(Z.valueOf(-mN));
      } else {
        while (mNum.size() < mN) {
          mNum.add(Z.ZERO);
        }
        mNum.add(Z.valueOf(mN));
      }
    }
    return RING.coeff(mNum, mDen, mN);
  }
}
