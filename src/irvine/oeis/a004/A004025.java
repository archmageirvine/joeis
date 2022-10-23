package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004025 Theta series of b.c.c. lattice with respect to long edge.
 * @author Sean A. Irvine
 */
public class A004025 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> X8 = RING.monomial(Z.ONE, 8);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.pow(RING.eta(X2, mN), 5, mN), RING.pow(RING.eta(X8, mN), 4, mN)), Z.TWO);
    final Polynomial<Z> b = RING.multiply(RING.pow(RING.eta(RING.x(), mN), 2, mN), RING.pow(RING.eta(X4, mN), 4, mN));
    return RING.coeff(a, b, mN);
  }
}
