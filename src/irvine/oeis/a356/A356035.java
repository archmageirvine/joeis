package irvine.oeis.a356;
// Generated by gen_seq4.pl decexro at 2023-01-13 08:23

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;
/**
 * A356035 Decimal expansion of the real root of x^3 - 2*x^2 - 1.
 * Polynomial: x^3-2*x^2-1
 * @author Georg Fischer
 */
public class A356035 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A356035() {
    super(1, Polynomial.create(-1, 0, -2, 1), CR.TWO, CR.THREE);
  }
}
