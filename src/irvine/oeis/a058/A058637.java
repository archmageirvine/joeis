package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058637 McKay-Thompson series of class 33B for Monster.
 * @author Sean A. Irvine
 */
public class A058637 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C3 = RING.monomial(Z.THREE, 1);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(eta, eta.substitutePower(11, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta.substitutePower(3, mN), eta.substitutePower(33, mN), mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    return c.coeff(mN).add(RING.coeff(C3, c, mN - 1));
  }
}
