package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A392501 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A392501 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A392501() {
    super(1, Polynomial.create(-6, 3, -6, 12, -4, 7, -7, 1, 0, 5, -2, -4, -12, 2, 7, 12, -7, -10, -4, 3, 9, -7, 0, -8, 14, -3, 9, 2, -3, -10, -2, -6, 1, 10, -3, 1, 7, -7, 7, -12, -5, 8, 6, 10, -8, -8, -7, -3, 9, 1, 6, 6, -2, -3, -10, -2, 3, 5, 2, -1, -1, -1, -1, -1, 1, 2, 2, -1, -2, -1, 0, 1), CR.valueOf(-1.1), CR.valueOf(-1.05), true);
  }
}
