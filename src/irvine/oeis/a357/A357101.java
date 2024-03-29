package irvine.oeis.a357;
// Generated by gen_seq4.pl decexro at 2023-01-13 08:23

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;
/**
 * A357101 Decimal expansion of the real root of x^3 - 2*x^2 - 2.
 * Polynomial: x^3-2*x^2-2
 * @author Georg Fischer
 */
public class A357101 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A357101() {
    super(1, Polynomial.create(-2, 0, -2, 1), CR.TWO, CR.THREE);
  }
}
