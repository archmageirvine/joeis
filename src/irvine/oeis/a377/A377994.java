package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-07-03.ack/filnum at 2025-07-03 22:12

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A377994 Numbers k such that k + PrimePi(k) is odd.
 * @author Georg Fischer
 */
public class A377994 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A377994() {
    super(1, 1, k -> Functions.PRIME_PI.z(k).add(k).testBit(0));
  }
}
