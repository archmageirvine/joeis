package irvine.oeis.a221;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a049.A049312;

/**
 * A221492 Number of tangled bicolored graphs on n unlabeled vertices.
 * @author Sean A. Irvine
 */
public class A221492 extends A049312 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mT = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mT.add(super.next());
    return ++mN < 4 ? Z.ZERO : RING.coeff(RING.one(), mT, mN).negate();
  }
}

