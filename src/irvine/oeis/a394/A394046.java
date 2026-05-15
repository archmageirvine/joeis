package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A394046 Decimal expansion of the positive real root of x^4 - 4*x^3 - 5*x^2 - 2*x - 1.
 * @author Sean A. Irvine
 */
public class A394046 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A394046() {
    super(Polynomial.create(-1, -2, -5, -4, 1), CR.FIVE, CR.SIX);
  }
}
