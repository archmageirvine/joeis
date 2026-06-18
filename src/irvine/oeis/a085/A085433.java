package irvine.oeis.a085;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085433 Resultant of the polynomial x^3-1 and the Chebyshev polynomial of the second kind U_n(x).
 * @author Sean A. Irvine
 */
public class A085433 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3_1 = Polynomial.create(-1, 0, 0, 1);
  private final ChebyshevPolynomials mC = new ChebyshevPolynomials(2);
  private int mN = 0;

  @Override
  public Z next() {
    return RING.resultant(X3_1, mC.getValue(++mN)).abs();
  }
}
