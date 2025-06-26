package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A384588 Decimal expansion of the weight factor for Laguerre-Gauss quadrature corresponding to abscissa A384586.
 * @author Sean A. Irvine
 */
public class A384588 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A384588() {
    super(0, Polynomial.create(9, -16960, 504576, -1990656, 1990656), CR.valueOf(0.03), CR.valueOf(0.04));
  }
}
