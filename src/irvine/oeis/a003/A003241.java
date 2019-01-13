package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A003241.
 * @author Sean A. Irvine
 */
public class A003241 extends A003238 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = 0;
  private Polynomial<Z> mP = RING.zero();

  private Polynomial<Z> rn(final int n) {
    switch (n) {
      case 0:
        return RING.x();
      case 1:
        return mP;
      case 2:
        return RING.divide(RING.add(RING.pow(mP, 2, mN + 1), mP.substitutePower(2, mN + 1)).shift(-1), Z.TWO);
      case 3:
        return RING.multiply(mP.substitutePower(2, mN + 2), mP, mN + 2).shift(-2);
      case 4:
        return RING.add(RING.multiply(mP, mP.substitutePower(3, mN + 3), mN + 3).shift(-3),
          RING.divide(RING.subtract(RING.pow(mP.substitutePower(2), 2, mN + 3), mP.substitutePower(4, mN + 3)).shift(-3), Z.TWO));
      default:
        final int t = 2 * mN + 1;
        return RING.subtract(RING.add(RING.multiply(mP.substitutePower(n - 2, t), mP.substitutePower(2, t), t),
          RING.multiply(mP.substitutePower(n - 1, t), mP, t)),
          mP.substitutePower(n, t)).shift(1 - n);
    }
  }

  @Override
  public Z next() {
    mP = RING.add(mP, RING.monomial(super.next(), ++mN + 1));
    Polynomial<Z> r = RING.zero();
    for (int k = 0; k < mN + 5; ++k) {
      r = RING.add(r, rn(k));
    }
    return r.coeff(mN);
  }
}
