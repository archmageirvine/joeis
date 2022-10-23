package irvine.oeis.a027;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027859 Theta series of odd Leech lattice (the unique unimodular 24-dimensional lattice with minimal norm 3).
 * @author Sean A. Irvine
 */
public class A027859 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Z Z48 = Z.valueOf(48);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> eta4 = RING.eta(X4, mN);
    final Polynomial<Z> t = RING.multiply(eta, eta4, mN);
    final Polynomial<Z> u = RING.series(RING.pow(eta2, 40, mN), RING.pow(t, 16, mN), mN);
    final Polynomial<Z> v = RING.series(RING.pow(t, 8, mN).shift(1), RING.pow(eta2, 8, mN), mN);
    return RING.multiply(u,
      RING.add(RING.subtract(RING.pow(u, 2, mN),
        RING.multiply(RING.multiply(u, v, mN), Z48)),
        RING.multiply(RING.pow(v, 2, mN), Z48)), mN)
      .coeff(mN);
  }
}
