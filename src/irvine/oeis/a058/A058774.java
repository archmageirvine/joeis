package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A058774 McKay-Thompson series of class 110A for Monster.
 * @author Sean A. Irvine
 */
public class A058774 extends A058713 {

  // After Michael Somos

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.x().shift(1);
  private static final Polynomial<Z> X3 = RING.x().shift(2);
  private static final Polynomial<Z> C3 = RING.monomial(Z.THREE, 2);
  private final Polynomial<Z> mT55Ax1 = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT55Ax1.add(super.next()); // scaled by x
    final Polynomial<Z> p2x2 = mT55Ax1.substitutePower(2, mN); // scaled by x^2
    final Polynomial<Z> g1 = RING.add(RING.x(), mT55Ax1); // scaled by x
    final Polynomial<Z> g2 = RING.add(X2, p2x2); // scaled by x^2
    final Polynomial<Z> g3 = RING.multiply(g1, g2, mN); // scaled by x^3
    final Polynomial<Z> num = RING.add(X3, g3); // scaled by x^3
    final Polynomial<Z> den = RING.add(RING.add(C3, mT55Ax1.shift(1)), p2x2);
    return RING.coeff(num, den, mN);
  }
}
