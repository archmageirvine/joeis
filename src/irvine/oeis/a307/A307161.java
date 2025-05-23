package irvine.oeis.a307;
// Generated by gen_seq4.pl 2025-04-22.ack/filtpos at 2025-04-22 22:21

import irvine.oeis.FilterPositionSequence;

/**
 * A307161 Numbers n such that A307159(n) = Sum_{k=1..n} bsigma(k) is divisible by n, where bsigma(k) is the sum of bi-unitary divisors of k (A188999).
 * @author Georg Fischer
 */
public class A307161 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A307161() {
    super(1, 1, new A307159(), (k, v) -> v.mod(k) == 0);
  }
}
