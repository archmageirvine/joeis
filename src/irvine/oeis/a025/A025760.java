package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025760 7th-order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025760 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.monomial(Z.SEVEN, 0);
  private int mN = -1;
  private Z mA = Z.ONE;
  private final Polynomial<Z> mD = RING.monomial(mA.add(Z.SIX), 0);

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(7L * mN - 8).multiply(7).divide(mN);
      mD.add(mA);
    }
    return RING.coeff(NUM, mD, mN);
  }
}
