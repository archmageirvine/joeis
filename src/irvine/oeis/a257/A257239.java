package irvine.oeis.a257;
// generated by patch_offset.pl at 2022-08-18 11:13

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A257239 Decimal expansion of the real root of x^3 + 4*x - 13.
 * Polynomial: x^3+4*x-13
 * @author Georg Fischer
 */
public class A257239 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A257239() {
    super(1, Polynomial.create(-13, 4, 0, 1), CR.ONE, CR.TWO);
  }
}
