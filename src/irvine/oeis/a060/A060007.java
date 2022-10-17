package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A060007 Decimal expansion of v_4, where v_n is the smallest, positive, real solution to the equation (v_n)^n = v_n + 1.
 * @author Sean A. Irvine
 */
public class A060007 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A060007() {
    super(1, Polynomial.create(-1, -1, 0, 0, 1), CR.ONE, CR.TWO);
  }
}
