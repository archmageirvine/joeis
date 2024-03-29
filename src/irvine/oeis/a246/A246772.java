package irvine.oeis.a246;
// Generated by gen_seq4.pl decexro at 2021-07-25 17:05

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A246772 Decimal expansion of 'u', an auxiliary constant associated with the asymptotic number of row-convex polyominoes.
 * Polynomial: 944*x^3-295*x^2+28*x-1
 * @author Georg Fischer
 */
public class A246772 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A246772() {
    super(Polynomial.create(-1, 28, -295, 944), CR.ZERO, CR.ONE);
  }
}
