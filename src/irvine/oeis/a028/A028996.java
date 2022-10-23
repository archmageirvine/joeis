package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028996 Theta series of quadratic form with Gram matrix [ 4, 1, 0, 2; 1, 4, 2, 0; 0, 2, 4, -1; 2, 0, -1, 4 ].
 * @author Sean A. Irvine
 */
public class A028996 extends Sequence0 {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = eta.substitutePower(2, mN);
    final Polynomial<Z> eta11 = eta.substitutePower(11, mN);
    final Polynomial<Z> eta22 = eta.substitutePower(22, mN);
    final Polynomial<Z> a1 = RING.pow(RING.multiply(eta, eta11, mN), 2, mN).shift(1);
    final Polynomial<Z> a2 = RING.pow(RING.multiply(eta2, eta22, mN), 2, mN).shift(2);
    return RING.add(RING.series(RING.pow(a1, 2, mN + 2), a2, mN),
      RING.multiply(RING.add(RING.add(a1, a2), RING.series(RING.pow(a2, 2, mN), a1, mN)), Z.FOUR))
      .coeff(mN);
  }
}
