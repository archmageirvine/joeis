package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028977 Theta series of 8-d 6-modular lattice G_2 tensor F_4 (or A_2 tensor D_4) with det 1296 and minimal norm 4 in powers of q^2.
 * @author Sean A. Irvine
 */
public class A028977 implements Sequence {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = eta.substitutePower(2, mN);
    final Polynomial<Z> eta3 = eta.substitutePower(3, mN);
    final Polynomial<Z> eta6 = eta.substitutePower(6, mN);
    final Polynomial<Z> b = RING.multiply(eta2, eta3, mN);
    final Polynomial<Z> a = RING.multiply(eta, eta6, mN);
    final Polynomial<Z> c = RING.subtract(RING.series(RING.pow(b, 7, mN), RING.pow(a, 5, mN), mN),
      RING.series(RING.pow(a, 7, mN).shift(1), RING.pow(b, 5, mN), mN));
    final Polynomial<Z> gf = RING.subtract(RING.pow(c, 2, mN), RING.multiply(RING.pow(RING.multiply(a, b, mN), 2, mN).shift(1), Z.EIGHT));
    return gf.coeff(mN);
  }
}
