package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058594 McKay-Thompson series of class 25A for Monster.
 * @author Sean A. Irvine
 */
public class A058594 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C5 = RING.monomial(Z.FIVE, 1);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> c = RING.series(eta, eta.substitutePower(25, mN), mN);
    return c.coeff(mN).add(RING.coeff(C5, c, mN - 1));
  }
}
