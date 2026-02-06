package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A392808 Maximum Mahler measure of all septic polynomials with coefficients in {-1, 0, 1}.
 * @author Sean A. Irvine
 */
public class A392808 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A392808() {
    super(1, Polynomial.create(-1, -1, -1, -3, 8, 10, -22, 68, -44, 34, -30, -68, 80, -114, -78, 16, 106, 36, -232, 346, 112, -114, 6, 76, -68, -50, -74, -36, 8, 10, -18, -16, -9, -3, 1, 1), CR.TWO, CR.THREE);
  }
}
