package irvine.oeis.a085;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085605 Resultant of the polynomial x^n-1 and the Chebyshev polynomial of the second kind U_n(x).
 * @author Sean A. Irvine
 */
public class A085605 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ChebyshevPolynomials mC = new ChebyshevPolynomials(2);
  private int mN = 0;

  @Override
  public Z next() {
    return RING.resultant(RING.oneMinusXToTheN(++mN), mC.getValue(mN)).abs();
  }
}
