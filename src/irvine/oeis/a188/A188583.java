package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A188583 Primes p such that 6*p^3+1 is also prime.
 * @author Georg Fischer
 */
public class A188583 extends FilterSequence {

  /** Construct the sequence. */
  public A188583() {
    super(1, new A000040(), p -> p.pow(3).multiply(6).add(1).isProbablePrime());
  }
}
