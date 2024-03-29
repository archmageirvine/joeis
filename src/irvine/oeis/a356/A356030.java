package irvine.oeis.a356;
// Generated by gen_seq4.pl decexro at 2023-01-13 08:23

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;
/**
 * A356030 Decimal expansion of the real root of x^3 - x - 2.
 * Polynomial: x^3-x-2
 * @author Georg Fischer
 */
public class A356030 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A356030() {
    super(1, Polynomial.create(-2, -1, 0, 1), CR.ONE, CR.TWO);
  }
}
