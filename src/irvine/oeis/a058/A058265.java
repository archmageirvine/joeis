package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.PolynomialRootExpansionSequence;

/**
 * A058265 Decimal expansion of the tribonacci constant t, the real root of x^3 - x^2 - x - 1.
 * @author Sean A. Irvine
 */
public class A058265 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A058265() {
    super(Polynomial.create(-1, -1, -1, 1), CR.ONE, CR.TWO);
  }
}
