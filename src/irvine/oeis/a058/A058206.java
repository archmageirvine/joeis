package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058206 McKay-Thompson series of class 12C for the Monster group.
 * @author Sean A. Irvine
 */
public class A058206 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ONE;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(3, mN), mN);
    final Polynomial<Z> b = RING.multiply(eta, eta.substitutePower(6, mN), mN);
    final Polynomial<Z> c = RING.pow(RING.series(a, b, mN), 6, mN);
    return c.coeff(mN).add(RING.coeff(RING.one(), c, mN - 1));
  }
}
