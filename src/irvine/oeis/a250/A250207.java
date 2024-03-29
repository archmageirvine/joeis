package irvine.oeis.a250;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A250207 The number of quartic terms in the multiplicative group modulo n.
 * @author Georg Fischer
 */
public class A250207 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A250207() {
    super(1, (p, e) -> p.equals(Z.TWO) ? (e <= 3 ? Z.ONE : Z.ONE.shiftLeft(e - 4)) : p.pow(e - 1).multiply(p.subtract(1)).divide(p.mod(Z.FOUR).equals(Z.ONE) ? 4 : 2));
  }
}
