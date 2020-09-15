package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058613 McKay-Thompson series of class 30B for the Monster group with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A058613 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(6, mN), mN), eta.substitutePower(10, mN), mN), eta.substitutePower(15, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(3, mN), mN), eta.substitutePower(5, mN), mN), eta.substitutePower(30, mN), mN);
    final Polynomial<Z> c = RING.pow(RING.series(a, b, mN), 3, mN);
    return c.coeff(mN).add(RING.coeff(RING.one(), c, mN - 2));
  }
}
