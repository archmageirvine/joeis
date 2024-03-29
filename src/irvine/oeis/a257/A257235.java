package irvine.oeis.a257;
// generated by patch_offset.pl at 2022-08-18 11:13

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A257235 Decimal expansion of the real root of x^3 + x - 6.
 * Polynomial: x^3+x-6
 * @author Georg Fischer
 */
public class A257235 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A257235() {
    super(1, Polynomial.create(-6, 1, 0, 1), CR.ONE, CR.TWO);
  }
}
