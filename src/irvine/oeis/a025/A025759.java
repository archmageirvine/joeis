package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a004.A004996;

/**
 * A025759 6th-order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025759 extends A004996 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.monomial(Z.SIX, 0);
  private int mN = -1;
  private Polynomial<Z> mD = RING.monomial(super.next().add(Z.FIVE), 0);

  @Override
  public Z next() {
    if (++mN > 0) {
      mD.add(super.next());
    }
    return RING.coeff(NUM, mD, mN);
  }
}
