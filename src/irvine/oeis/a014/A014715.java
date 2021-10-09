package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A014715 Decimal expansion of Conway's constant.
 * @author Sean A. Irvine
 */
public class A014715 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A014715() {
    super(Polynomial.create(-6, 3, -6, 12, -4, 7, -7, 1, 0, 5, -2, -4, -12, 2, 7, 12, -7, -10, -4, 3, 9, -7, 0, -8, 14, -3, 9, 2, -3, -10, -2, -6, 1, 10, -3, 1, 7, -7, 7, -12, -5, 8, 6, 10, -8, -8, -7, -3, 9, 1, 6, 6, -2, -3, -10, -2, 3, 5, 2, -1, -1, -1, -1, -1, 1, 2, 2, -1, -2, -1, 0, 1), CR.ONE, CR.TWO);
  }
}
