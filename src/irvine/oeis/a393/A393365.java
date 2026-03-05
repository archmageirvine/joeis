package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393365 Decimal expansion of the weight factor for Hermite-Gauss quadrature of degree 6 corresponding to abscissa A393362.
 * @author Sean A. Irvine
 */
public class A393365 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393365() {
    super(0, new PolynomialRootExpansionSequence(0, Polynomial.create(-1, 405, -5400, 10800), CR.valueOf(0.3), CR.ONE).getCR().multiply(CR.SQRT_PI));
  }
}
