package irvine.oeis.a271;
// Generated by gen_seq4.pl 2024-08-18.ack/filter at 2024-08-18 22:15

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A271666 Primes p such that 4*p^2+4*p-1 is prime.
 * @author Georg Fischer
 */
public class A271666 extends FilterSequence {

  /** Construct the sequence. */
  public A271666() {
    super(1, new A000040(), p -> p.square().add(p).multiply(4).subtract(1).isProbablePrime());
  }
}
