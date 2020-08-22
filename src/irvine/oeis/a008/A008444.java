package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008444 Theta series of A_4 lattice.
 * @author Sean A. Irvine
 */
public class A008444 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X5 = RING.monomial(Z.ONE, 5);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta5 = RING.eta(X5, mN);
    return RING.coeff(RING.pow(eta, 5, mN), eta5, mN).add(RING.coeff(RING.pow(eta5, 5, mN).shift(1), eta, mN).multiply(25));
  }
}
