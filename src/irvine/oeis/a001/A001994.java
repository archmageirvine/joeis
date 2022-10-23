package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001994 Expansion of 1/((1-x^2)*(1-x^4)^2*(1-x^6)*(1-x^8)*(1-x^10)) (even powers only).
 * @author Sean A. Irvine
 */
public class A001994 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 0, -1, 0, -2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, -2, 0, -2, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, -2, 0, -1, 0, 1);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.coeff(RING.one(), DEN, mN);
  }
}
