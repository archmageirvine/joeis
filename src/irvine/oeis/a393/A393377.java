package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393377 Minimum Mahler measure of all irreducible and non-cyclotomic quintic polynomials with coefficients in {-1, 0, 1}.
 * @author Sean A. Irvine
 */
public class A393377 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393377() {
    super(1, Polynomial.create(1, 0, 0, -1, 0, -1, 1, -2, 1, -1, 1), CR.ONE, CR.TWO);
  }
}
