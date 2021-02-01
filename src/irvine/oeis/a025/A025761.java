package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025761 8th-order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025761 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.monomial(Z.EIGHT, 0);
  private int mN = -1;
  private Z mA = Z.ONE;
  private Polynomial<Z> mD = RING.monomial(mA.add(Z.SEVEN), 0);

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(8 * mN - 9).multiply(8).divide(mN);
      mD.add(mA);
    }
    return RING.coeff(NUM, mD, mN);
  }
}
