package irvine.oeis.a300;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A300828 Multiplicative with a(p^2) = 1, a(p^3) = -2 and a(p^e) = 0 when e = 1 or e &gt; 3.
 * @author Georg Fischer
 */
public class A300828 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A300828() {
    super(1, (p, e) -> e == 2 ? Z.ONE : (e == 3 ? Z.valueOf(-2) : Z.ZERO));
  }
}
