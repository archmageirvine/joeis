package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-02-08.ack/decexro at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A228777 Decimal expansion of the third smallest Pisot-Vijayaraghavan number.
 * Polynomial: x^5-x^4-x^3+x^2-1
 * @author Georg Fischer
 */
public class A228777 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A228777() {
    super(1, Polynomial.create(-1, 0, 1, -1, -1, 1), CR.valueOf(1), CR.valueOf(2));
  }
}
