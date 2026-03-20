package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393372 Decimal expansion of the weight factor for Hermite-Gauss quadrature of degree 7 corresponding to abscissa A393368.
 * @author Sean A. Irvine
 */
public class A393372 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393372() {
    super(0, CR.SQRT_PI.multiply(new PolynomialRootExpansionSequence(Polynomial.create(-5, 9303, -335160, 1234800), CR.valueOf(0.1), CR.ONE).getCR()));
  }
}
