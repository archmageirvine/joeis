package irvine.oeis.a368;
// Generated by gen_seq4.pl 2025-06-01.ack/mulr at 2025-06-01 21:15

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A368886 The largest unitary divisor of n without an exponent 2 in its prime factorization (A337050).
 * Multiplicative with: a(p^2) = 1, and a(p^e) = p^e if e != 2
 * @author Georg Fischer
 */
public class A368886 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A368886() {
    super(1, (p, e) -> e == 2 ? Z.ONE : p.pow(e));
  }
}
