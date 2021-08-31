package irvine.oeis.a328;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A328785 Expansion of q^(-1/3) * (1/3) * b(q)*c(q)/a(q)^2 in powers of q where a(), b(), c() are cubic AGM functions.
 * @author Sean A. Irvine
 */
public class A328785 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> Z16 = RING.monomial(Z.valueOf(16), 1);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X6 = RING.monomial(Z.ONE, 6);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> eta3 = RING.eta(X3, mN);
    final Polynomial<Z> eta6 = RING.eta(X6, mN);
    final Polynomial<Z> a = RING.multiply(eta, eta3, mN);
    final Polynomial<Z> b = RING.multiply(eta2, eta6, mN);
    final Polynomial<Z> c = RING.series(a, b, mN);
    final Polynomial<Z> d = RING.multiply(c, c, mN);
    return RING.coeff(RING.one(), RING.add(d, RING.series(Z16, RING.multiply(d, d, mN), mN)), mN);
  }
}

