package irvine.oeis.a214;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A214682 Remove 2's that do not contribute to a factor of 4 from the prime factorization of n.
 * @author Georg Fischer
 */
public class A214682 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A214682() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft((e / 2) * 2) : p.pow(e));
  }
}
