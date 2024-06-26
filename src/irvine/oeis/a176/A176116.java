package irvine.oeis.a176;
// Generated by gen_seq4.pl 2024-03-30/filter at 2024-03-30 20:29

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A176116 Primes p such that p^4+1 = 2q where q is prime.
 * @author Georg Fischer
 */
public class A176116 extends FilterSequence {

  /** Construct the sequence. */
  public A176116() {
    super(1, new A000040(), p -> p.pow(4).add(1).divide(2).isProbablePrime());
  }
}
