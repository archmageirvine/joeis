package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393038 Maximum Mahler measure of all pentic polynomials with coefficients in {-1, 0, 1}.
 * @author Sean A. Irvine
 */
public class A393038 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393038() {
    super(1, Polynomial.create(1, -1, 2, -1, -3, -4, 1, -1, -2, -1, 1), CR.TWO, CR.THREE);
  }
}
