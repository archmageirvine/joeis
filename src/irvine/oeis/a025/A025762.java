package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025762 9th order Vatalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025762 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.monomial(Z.NINE, 0);
  private int mN = -1;
  private Z mA = Z.ONE;
  private Polynomial<Z> mD = RING.monomial(mA.add(Z.EIGHT), 0);

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(9 * mN - 10).multiply(9).divide(mN);
      mD.add(mA);
    }
    return RING.coeff(NUM, mD, mN);
  }
}
