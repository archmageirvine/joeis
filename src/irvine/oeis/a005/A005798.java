package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005798.
 * @author Sean A. Irvine
 */
public class A005798 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    final Polynomial<Z> e1 = RING.pow(RING.eta(RING.x(), mN), 8, mN);
    final Polynomial<Z> e2 = RING.pow(RING.eta(X4, mN), 16);
    final Polynomial<Z> e3 = RING.pow(RING.eta(X2, mN), 24);
    return RING.coeff(RING.multiply(e1, e2, mN), e3, mN);
  }
}
