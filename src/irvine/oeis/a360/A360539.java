package irvine.oeis.a360;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A360539 a(n) is the cubefree part of n: the largest unitary divisor of n that is a cubefree number (A004709).
 * Multiplicative with: a(p^e) = p^e if e <= 2, and 1 otherwise.
 * @author Georg Fischer
 */
public class A360539 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A360539() {
    super(1, (p, e) -> e <= 2 ? p.pow(e) : Z.ONE);
  }
}
