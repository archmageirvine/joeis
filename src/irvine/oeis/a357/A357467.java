package irvine.oeis.a357;
// Generated by gen_seq4.pl decexro at 2023-01-13 08:23

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;
/**
 * A357467 Decimal expansion of the real root of 3*x^3 + x - 1.
 * Polynomial: 3*x^3+x-1
 * @author Georg Fischer
 */
public class A357467 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A357467() {
    super(0, Polynomial.create(-1, 1, 0, 3), CR.valueOf(0.5), CR.valueOf(0.6));
  }
}
