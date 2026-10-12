package irvine.oeis.a086;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086840 Resultant of the polynomial x^n-1 and the Chebyshev polynomial of the first kind T_n(x).
 * @author Sean A. Irvine
 */
public class A086840 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ChebyshevPolynomials mC = new ChebyshevPolynomials(1);
  private int mN = 0;

  @Override
  public Z next() {
    return RING.resultant(RING.oneMinusXToTheN(++mN), mC.getValue(mN));
  }
}
