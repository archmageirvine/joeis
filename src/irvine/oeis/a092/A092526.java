package irvine.oeis.a092;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A092526 Decimal expansion of (2/3)*cos( (1/3)*arccos(29/2) ) + 1/3, the real root of x^3 - x^2 - 1.
 * @author Sean A. Irvine
 */
public class A092526 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A092526() {
    super(1, Polynomial.create(-1, 0, -1, 1), CR.ONE, CR.TWO);
  }
}
