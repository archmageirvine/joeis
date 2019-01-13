package irvine.oeis.a045;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045831.
 * @author Sean A. Irvine
 */
public class A045831 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a = RING.pow(RING.eta(X4, mN), 4, mN);
    final Polynomial<Z> b = RING.eta(RING.x(), mN);
    return RING.coeff(a, b, mN);
  }
}
