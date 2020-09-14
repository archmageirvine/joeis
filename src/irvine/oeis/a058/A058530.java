package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058530 McKay-Thompson series of class 17A for the Monster simple group.
 * @author Sean A. Irvine
 */
public class A058530 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2p5 = RING.pow(eta.substitutePower(2, mN), 5, mN);
    final Polynomial<Z> eta4p2 = RING.pow(eta.substitutePower(4, mN), 2, mN);
    final Polynomial<Z> eta17 = eta.substitutePower(17, mN);
    final Polynomial<Z> eta17p3 = RING.pow(eta17, 3, mN);
    final Polynomial<Z> eta34 = eta.substitutePower(34, mN);
    final Polynomial<Z> eta34p5 = RING.pow(eta34, 5, mN);
    final Polynomial<Z> eta68p2 = RING.pow(eta.substitutePower(68, mN), 2, mN);

    final Polynomial<Z> a = RING.multiply(eta4p2, eta34p5, mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(2, mN), mN), eta17p3, mN), eta68p2, mN);
    final Polynomial<Z> c = RING.series(a, b, mN);

    final Polynomial<Z> d = RING.multiply(eta2p5, eta68p2.shift(4), mN);
    final Polynomial<Z> e = RING.multiply(RING.multiply(RING.multiply(RING.pow(eta, 3, mN), eta4p2, mN), eta17, mN), eta34, mN);

    final Polynomial<Z> f = RING.subtract(c, RING.series(d, e, mN));
    return RING.pow(f, 2, mN).coeff(mN);
  }
}
