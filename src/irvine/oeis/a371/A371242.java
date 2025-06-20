package irvine.oeis.a371;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A371242 The sum of the unitary divisors of n that are cubefree numbers (A004709).
 * Multiplicative with:
 * @author Georg Fischer
 */
public class A371242 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A371242() {
    super(1, (p, e) -> e <= 2 ? p.pow(e).add(1) : Z.ONE);
  }
}
