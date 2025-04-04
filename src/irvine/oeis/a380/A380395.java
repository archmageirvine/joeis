package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-03-26.ack/mulr at 2025-03-26 22:40

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A380395 The number of unitary divisors of n that are cubes.
 * Multiplicative with: 2 is e is divisible by 3, and 1 otherwise.
 * @author Georg Fischer
 */
public class A380395 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A380395() {
    super(1, (p, e) -> (e % 3) == 0 ? Z.TWO : Z.ONE);
  }
}
