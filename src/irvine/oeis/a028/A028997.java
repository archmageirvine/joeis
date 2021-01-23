package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028997 Theta series of quadratic form with Gram matrix [ 4, 1, 0, 1; 1, 4, 1, 0; 0, 1, 4, -1; 1, 0, -1, 4 ].
 * @author Sean A. Irvine
 */
public class A028997 implements Sequence {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = eta.substitutePower(2, mN);
    final Polynomial<Z> eta7 = eta.substitutePower(7, mN);
    final Polynomial<Z> eta14 = eta.substitutePower(14, mN);
    final Polynomial<Z> a = RING.multiply(eta, eta7, mN);
    final Polynomial<Z> b = RING.multiply(eta2, eta14, mN);
    final Polynomial<Z> r = RING.series(RING.pow(a, 4, mN), RING.pow(b, 2, mN), mN);
    final Polynomial<Z> s = RING.multiply(RING.multiply(a, b, mN).shift(1), Z.FOUR);
    final Polynomial<Z> t = RING.multiply(RING.pow(RING.series(RING.pow(b, 2, mN), a, mN), 2, mN).shift(2), Z.EIGHT);
    final Polynomial<Z> gf = RING.add(RING.add(r, s), t);
    return gf.coeff(mN);
  }
}
