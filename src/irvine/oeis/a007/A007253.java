package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007253 McKay-Thompson series of class 5a for Monster.
 * @author Sean A. Irvine
 */
public class A007253 extends AbstractSequence {

  /* Construct the sequence. */
  public A007253() {
    super(-1);
  }

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X5 = RING.monomial(Z.ONE, 5);
  private static final Polynomial<Z> X25 = RING.monomial(Z.ONE, 25);
  protected int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    final int deg = mN + 1; // One higher so we can shift up by 1 to hand q^-1
    final Polynomial<Z> eta = RING.eta(RING.x(), deg);
    final Polynomial<Z> eta5 = RING.eta(X5, deg);
    final Polynomial<Z> eta25 = RING.eta(X25, deg);
    final Polynomial<Z> a = RING.add(RING.one(), RING.series(RING.multiply(eta25.shift(1), Z.FIVE), eta, deg));
    final Polynomial<Z> b = RING.add(RING.x(), RING.pow(RING.series(eta, eta5, deg), 6, deg));
    final Polynomial<Z> ab = RING.multiply(a, b, deg).shift(-1);

    final Polynomial<Z> c = RING.series(eta.shift(1), eta25.shift(1), deg);
    final Polynomial<Z> d = RING.series(RING.multiply(eta25.shift(1), Z.FIVE), eta, deg).shift(1);
    final Polynomial<Z> cd5 = RING.multiply(RING.subtract(c, d), Z.FIVE); // is shifted up by 1
    final Polynomial<Z> e = RING.series(RING.multiply(RING.pow(eta25, 3, deg).shift(2), RING.pow(eta, 3, deg), deg), RING.pow(eta5, 6, deg), deg);
    final Polynomial<Z> cd5e = RING.multiply(cd5, e, deg).shift(-1);

    final Polynomial<Z> f = RING.add(ab, cd5e);
    return f.coeff(mN);
  }
}
