package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.oeis.MultiplicativeSequence;

/**
 * A380322 a(n) is the sum of exponentially odd divisors of n^2.
 * Multiplicative with:
 * @author Georg Fischer
 */
public class A380322 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A380322() {
    super(1, (p, e) -> p.pow(2L * e + 1).subtract(p).divide(p.multiply(p).subtract(1)).add(1));
  }
}
