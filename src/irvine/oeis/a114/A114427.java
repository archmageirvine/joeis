package irvine.oeis.a114;
// generated by patch_offset.pl at 2022-08-18 11:13

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A114427 Decimal expansion of the real solution of x^3-x^2-x-4=0.
 * Polynomial: x^3-x^2-x-4
 * @author Georg Fischer
 */
public class A114427 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A114427() {
    super(1, Polynomial.create(-4, -1, -1, 1), CR.TWO, CR.THREE);
  }
}
