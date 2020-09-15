package irvine.oeis.a112;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A112169 McKay-Thompson series of class 28B for the Monster group.
 * @author Sean A. Irvine
 */
public class A112169 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C4 = RING.monomial(Z.FOUR, 0);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(eta, eta.substitutePower(7, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta.substitutePower(4, mN), eta.substitutePower(28, mN), mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    return c.coeff(mN).add(RING.coeff(C4, c, mN - 2));
  }
}
