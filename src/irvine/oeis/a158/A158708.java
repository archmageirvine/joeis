package irvine.oeis.a158;
// Generated by gen_seq4.pl 2023-09-18/filter at 2023-09-18 23:12

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A158708 Primes p such that p + floor(p/2) is prime.
 * @author Georg Fischer
 */
public class A158708 extends FilterSequence {

  /** Construct the sequence. */
  public A158708() {
    super(1, new A000040(), p -> p.add(p.divide2()).isProbablePrime());
  }
}
