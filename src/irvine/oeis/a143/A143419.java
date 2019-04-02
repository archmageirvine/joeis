package irvine.oeis.a143;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A143419 G.f.: 1/p(x), where p(x) = degree 22 Salem polynomial p(x) = x^22 + x^21 - x^19 - 2*x^18 - 3*x^17 - 3*x^16 - 2*x^15 + 2*x^13 + 4*x^12 + 5*x^11 + 4*x^10 + 2*x^9 - 2*x^7 - 3*x^6 - 3*x^5 - 2*x^4 - x^3 + x + 1.
 * @author Sean A. Irvine
 */
public class A143419 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 1, 0, -1, -2, -3, -3, -2, 0, 2, 4, 5, 4, 2, 0, -2, -3, -3, -2, -1, 0, 1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), DEN, ++mN);
  }
}
