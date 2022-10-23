package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025763 10th-order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025763 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.monomial(Z.TEN, 0);
  private int mN = -1;
  private Z mA = Z.ONE;
  private Polynomial<Z> mD = RING.monomial(mA.add(Z.NINE), 0);

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(10 * mN - 11).multiply(10).divide(mN);
      mD.add(mA);
    }
    return RING.coeff(NUM, mD, mN);
  }
}
