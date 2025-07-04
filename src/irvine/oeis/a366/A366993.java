package irvine.oeis.a366;
// Generated by gen_seq4.pl 2025-06-01.ack/mulr at 2025-06-01 21:15

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A366993 The largest divisor of n that is a term of A056166.
 * Multiplicative with:
 * @author Georg Fischer
 */
public class A366993 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A366993() {
    super(1, (p, e) -> e == 1 ? Z.ONE : p.pow(Functions.PREV_PRIME.i(e + 1)));
  }
}
