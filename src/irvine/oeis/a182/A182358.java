package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-12-20.ack/filtpos at 2024-12-20 14:00

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000005;

/**
 * A182358 Numbers n for which the number of divisors of n is congruent to 2 mod 4.
 * @author Georg Fischer
 */
public class A182358 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A182358() {
    super(1, 1, new A000005(), v -> v.mod(4) == 2);
  }
}
