package irvine.oeis.a026;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A026418 Number of ordered trees with n edges and having no branches of length 1.
 * @author Sean A. Irvine
 */
public class A026418 extends A000108 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> XD = Polynomial.create(1, -1, 1);
  private Polynomial<Z> mC = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mC.add(super.next());
    final Polynomial<Z> s = RING.series(X2, XD, ++mN);
    return RING.substitute(mC, s, mN).coeff(mN);
  }
}
