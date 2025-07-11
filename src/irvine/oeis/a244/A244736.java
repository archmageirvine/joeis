package irvine.oeis.a244;
// Generated by gen_seq4.pl 2025-05-26.ack/filnum at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A244736 Numbers k such that (prime(k) mod 5) is even.
 * @author Georg Fischer
 */
public class A244736 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A244736() {
    super(1, 1, k -> (Functions.PRIME.z(k).mod(5) & 1) == 0);
  }
}
