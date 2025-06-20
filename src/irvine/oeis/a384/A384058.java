package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A384058 The number of integers k from 1 to n such that the greatest divisor of k that is a unitary divisor of n is a 5-rough number (A007310).
 * Multiplicative with: if p <= 3, and p^e if p >= 5
 * @author Georg Fischer
 */
public class A384058 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A384058() {
    super(1, (p, e) -> p.compareTo(Z.THREE) <= 0 ? p.pow(e).subtract(1) : p.pow(e));
  }
}
