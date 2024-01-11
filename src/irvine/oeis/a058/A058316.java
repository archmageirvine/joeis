package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a007.A007097;

/**
 * A058316 Apply inverse of "INVERT" transform to A007097, i.e.; the coefficients of the series 1/(1 + 2x + 3x^2 + 5x^3 + 11x^4 + 31x^5 + 127x^6 + 709x^7 ... ).
 * @author Sean A. Irvine
 */
public class A058316 extends A007097 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.coeff(RING.one(), mA, ++mN);
  }
}
