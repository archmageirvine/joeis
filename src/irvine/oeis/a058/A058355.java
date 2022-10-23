package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058355 Coefficients in the series (1 + x^2 + x^3 + x^5 + x^7 + x^11 + x^13 + ... )/(1 - x - x^4 - x^6 - x^8 - x^9 - x^10 - x^12 - x^14 - ... ).
 * @author Sean A. Irvine
 */
public class A058355 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private final Polynomial<Z> mNum = RING.empty();
  private final Polynomial<Z> mDen = RING.empty();
  {
    mNum.add(Z.ONE);
    mDen.add(Z.ONE);
  }
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mPrime.isPrime(mN)) {
        while (mNum.size() < mN) {
          mNum.add(Z.ZERO);
        }
        mNum.add(Z.ONE);
      } else {
        while (mDen.size() < mN) {
          mDen.add(Z.ZERO);
        }
        mDen.add(Z.NEG_ONE);
      }
    }
    return RING.coeff(mNum, mDen, mN);
  }
}
