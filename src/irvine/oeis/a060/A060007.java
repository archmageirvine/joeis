package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A060007 Decimal expansion of the positive real root of x^4 - x - 1.
 * @author Sean A. Irvine
 */
public class A060007 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A060007() {
    super(1, Polynomial.create(-1, -1, 0, 0, 1), CR.ONE, CR.TWO);
  }
}
