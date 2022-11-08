package irvine.oeis.a357;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A357469 Decimal expansion of the real root of x^3 - x^2 + x - 2.
 * @author Sean A. Irvine
 */
public class A357469 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A357469() {
    super(1, Polynomial.create(-2, 1, -1, 1), CR.ONE, CR.TWO);
  }
}
