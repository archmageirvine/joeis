package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058640 McKay-Thompson series of class 35A for Monster.
 * @author Sean A. Irvine
 */
public class A058640 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(eta.substitutePower(5, mN), eta.substitutePower(7, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta, eta.substitutePower(35, mN), mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    return c.coeff(mN).subtract(RING.coeff(RING.x(), c, mN - 1));
  }
}
