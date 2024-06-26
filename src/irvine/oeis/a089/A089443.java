package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A089443 Primes p such that 12*p + 13 is prime.
 * @author Georg Fischer
 */
public class A089443 extends FilterSequence {

  /** Construct the sequence. */
  public A089443() {
    super(1, new A000040(), p -> p.multiply(12).add(13).isProbablePrime());
  }
}
