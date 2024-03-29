package irvine.oeis.a106;
// Generated by gen_seq4.pl priquad4.dirty/priquad4 at 2022-01-07 18:16

import irvine.oeis.prime.BinaryQuadraticForm;

/**
 * A106991 Primes of the form 5x^2-5xy+6y^2, with x and y nonnegative.
 * @author Georg Fischer
 */
public class A106991 extends BinaryQuadraticForm {

  /** Construct the sequence. */
  public A106991() {
    super(5, -5, 6, true, true);
  }
}
