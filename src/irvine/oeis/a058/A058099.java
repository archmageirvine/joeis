package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058099 McKay-Thompson series of class 10C for Monster.
 * @author Sean A. Irvine
 */
public class A058099 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(eta, eta.substitutePower(2, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta.substitutePower(5, mN), eta.substitutePower(10, mN), mN);
    final Polynomial<Z> c = RING.pow(RING.series(a, b, mN), 2, mN);
    return c.coeff(mN);
  }
}
