package irvine.oeis.a202;
// generated by patch_offset.pl at 2022-08-18 11:13

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A202300 Decimal expansion of the real root of x^3 + 2x^2 + 10x - 20.
 * Polynomial: <code>x^3+2x^2+10x-20</code>
 * @author Georg Fischer
 */
public class A202300 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A202300() {
    super(1, Polynomial.create(-20, 10, 2, 1), CR.ONE, CR.TWO);
  }
}
