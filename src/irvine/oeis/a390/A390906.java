package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A390906 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A390906 extends PolynomialRootExpansionSequence {

  // -1 + x + 2*x^3 - 3*x^4 + 2*x^5 - 2*x^6 + 4*x^7 - x^8 + 2*x^9 - 2*x^10 - x^11 - 3*x^12 + x^15

  /** Construct the sequence. */
  public A390906() {
    super(1, Polynomial.create(-1, 1, 0, 2, -3, 2, -2, 4, -1, 2, -2, -1, -3, 0, 0, 1), CR.ONE, CR.TWO);
  }
}
