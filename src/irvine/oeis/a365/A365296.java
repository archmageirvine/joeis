package irvine.oeis.a365;
// Generated by gen_seq4.pl mult3man/mult at 2023-10-07 22:14

import irvine.oeis.MultiplicativeSequence;

/**
 * A365296 The smallest coreful infinitary divisor of n.
 * Multiplicative with: Multiplicative with a(p^e) = p^A006519(e).
 * @author Georg Fischer
 */
public class A365296 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A365296() {
    super(1, (p, e) -> p.pow(Integer.lowestOneBit(e)));
  }
}
