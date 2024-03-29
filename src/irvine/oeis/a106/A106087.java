package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-03-19/filter at 2024-03-19 22:04

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A106087 Primes p such that 7*p+4 and 4*p+7 are primes.
 * @author Georg Fischer
 */
public class A106087 extends FilterSequence {

  /** Construct the sequence. */
  public A106087() {
    super(1, new A000040(), p -> p.multiply(7).add(4).isProbablePrime() && p.multiply(4).add(7).isProbablePrime());
  }
}
