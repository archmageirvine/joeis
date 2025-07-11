package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.oeis.MultiplicativeSequence;

/**
 * A384050 The number of integers k from 1 to n such that the greatest divisor of k that is a unitary divisor of n is a powerful number.
 * Multiplicative with:
 * @author Georg Fischer
 */
public class A384050 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A384050() {
    super(1, (p, e) -> e == 1 ? p.subtract(1) : p.pow(e));
  }
}
