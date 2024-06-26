package irvine.oeis.a261;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A261537 Primes p such that p^7 + 2 is also prime.
 * @author Georg Fischer
 */
public class A261537 extends FilterSequence {

  /** Construct the sequence. */
  public A261537() {
    super(1, new A000040(), p -> p.pow(7).add(2).isProbablePrime());
  }
}
