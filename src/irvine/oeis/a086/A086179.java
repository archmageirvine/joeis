package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A086179 Decimal expansion of upper bound for the r-values supporting stable period-3 orbits in the logistic equation.
 * @author Sean A. Irvine
 */
public class A086179 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A086179() {
    super(0, Polynomial.create(-81, -36, -14, 24, 4, -6, 1), CR.THREE, CR.FOUR);
  }
}

