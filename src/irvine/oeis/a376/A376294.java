package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A376294 The product of n's prime powers, with the base and exponent concatenated.
 * Multiplicative with:
 * @author Georg Fischer
 */
public class A376294 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A376294() {
    super(1, (p, e) -> new Z(p.toString() + Integer.toString(e)));
  }
}
