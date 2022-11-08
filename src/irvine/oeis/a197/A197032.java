package irvine.oeis.a197;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A197032 Decimal expansion of the x-intercept of the shortest segment from the positive x axis through (2,1) to the line y=x.
 * @author Sean A. Irvine
 */
public class A197032 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A197032() {
    super(1, Polynomial.create(-5, 6, -4, 1), CR.TWO, CR.THREE);
  }
}
