package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-08.ack/decexro at 2025-02-08 20:47

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A372271 Decimal expansion of the smallest positive zero of the Legendre polynomial of degree 6.
 * Polynomial: 231*x^6-315*x^4+105*x^2-5
 * @author Georg Fischer
 */
public class A372271 extends PolynomialRootExpansionSequence {

  /** Construct the sequence */
  public A372271() {
    super(0, Polynomial.create(-5, 0, 105, 0, -315, 0, 231), CR.valueOf(0.2), CR.valueOf(0.3));
  }
}
