package irvine.oeis.a289;
// Generated by gen_seq4.pl 2024-02-27/filter at 2024-02-27 18:15

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A289556 Primes p such that both 5*p - 4 and 4*p - 5 are prime.
 * @author Georg Fischer
 */
public class A289556 extends FilterSequence {

  /** Construct the sequence. */
  public A289556() {
    super(1, new A000040(), p -> p.multiply(5).subtract(4).isProbablePrime() && p.multiply(4).subtract(5).isProbablePrime());
  }
}
