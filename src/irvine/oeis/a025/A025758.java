package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a049.A049393;

/**
 * A025758 5th-order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025758 extends A049393 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.monomial(Z.FIVE, 0);
  private int mN = -1;
  private final Polynomial<Z> mD = RING.monomial(super.next().add(Z.FOUR), 0);

  @Override
  public Z next() {
    if (++mN > 0) {
      mD.add(super.next());
    }
    return RING.coeff(NUM, mD, mN);
  }
}
