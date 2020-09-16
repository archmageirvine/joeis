package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058725 McKay-Thompson series of class 60A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058725 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(3, mN), mN), eta.substitutePower(10, mN), mN), eta.substitutePower(15, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(5, mN), mN), eta.substitutePower(6, mN), mN), eta.substitutePower(30, mN), mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    return c.coeff(mN).add(RING.coeff(RING.one(), c, mN - 1));
  }
}
