package irvine.oeis.a242;
// generated by patch_offset.pl at 2022-08-18 11:13

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A242721 Decimal expansion of the positive real root of 3*x^4 - x^3 - x^2 - 2, a constant related to quasi-isometric mappings.
 * Polynomial: 3*x^4-x^3-x^2-2
 * @author Georg Fischer
 */
public class A242721 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A242721() {
    super(1, Polynomial.create(-2, 0, -1, -1, 3), CR.ONE, CR.TWO);
  }
}
