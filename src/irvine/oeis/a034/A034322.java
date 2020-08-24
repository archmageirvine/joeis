package irvine.oeis.a034;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034322 McKay-Thompson series of class 71A for Monster.
 * @author Sean A. Irvine
 */
public class A034322 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1N = RING.negate(RING.x());
  private static final Polynomial<Z> X2N = RING.monomial(Z.NEG_ONE, 2);
  private static final Polynomial<Z> X3N = RING.monomial(Z.NEG_ONE, 3);
  private static final Polynomial<Z> X4N = RING.monomial(Z.NEG_ONE, 4);
  private static final Polynomial<Z> X71 = RING.monomial(Z.ONE, 71);
  private int mN = -1;

  private static Polynomial<Z> qPochhammer(final Polynomial<Z> a, final Polynomial<Z> q, final int n) {
    Polynomial<Z> prod = RING.one();
    Polynomial<Z> t = a;
    for (int k = 0; k <= n; ++k, t = RING.multiply(t, q, n)) {
      prod = RING.multiply(prod, RING.subtract(RING.one(), t), n);
    }
    return prod;
  }

  private static Polynomial<Z> f(final Polynomial<Z> x, final Polynomial<Z> y, final int n) {
    final Polynomial<Z> xy = RING.multiply(x, y, n);
    return RING.multiply(RING.multiply(
      qPochhammer(RING.negate(x), xy, n),
      qPochhammer(RING.negate(y), xy, n), n),
      qPochhammer(xy, xy, n), n);
  }

  private static Polynomial<Z> g(final int n) {
    return RING.series(f(X2N, X3N, n), f(X1N, X2N, n), n);
  }

  private static Polynomial<Z> h(final int n) {
    return RING.series(f(X1N, X4N, n), f(X1N, X2N, n), n);
  }

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> g = g(mN);
    final Polynomial<Z> h = h(mN);
    return RING.multiply(g.substitutePower(71, mN), h, mN).coeff(mN)
      .subtract(RING.multiply(h.substitutePower(71, mN), g, mN).shift(14).coeff(mN));
  }
}

