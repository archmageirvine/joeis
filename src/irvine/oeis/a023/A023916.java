package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023916 Theta series of <code>A*_4</code> lattice.
 * @author Sean A. Irvine
 */
public class A023916 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X5 = RING.monomial(Z.ONE, 5);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta5 = RING.eta(X5, mN);
    final Z a = RING.coeff(RING.multiply(RING.pow(eta5, 5, mN).shift(1), Z.FIVE), eta, mN);
    final Z b = RING.coeff(RING.pow(eta, 5, mN), eta5, mN);
    return a.add(b);
  }
}
