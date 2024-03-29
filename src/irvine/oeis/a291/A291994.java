package irvine.oeis.a291;
// Generated by gen_seq4.pl 2023-09-05/filter at 2023-09-05 16:05

import irvine.oeis.FilterSequence;
import irvine.oeis.a020.A020505;

/**
 * A291994 Primes of the form Phi(k, -6), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A291994 extends FilterSequence {

  /** Construct the sequence. */
  public A291994() {
    super(1, new A020505(), PRIME);
  }
}
