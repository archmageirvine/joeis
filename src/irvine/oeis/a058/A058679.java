package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058679 McKay-Thompson series of class 44A for Monster.
 * @author Sean A. Irvine
 */
public class A058679 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.pow(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(22, mN), mN), 2, mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(4, mN), mN), eta.substitutePower(11, mN), mN), eta.substitutePower(44, mN), mN);
    final Polynomial<Z> c = RING.pow(RING.series(a, b, mN), 2, mN);
    return c.coeff(mN);
  }
}
