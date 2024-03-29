package irvine.oeis.a319;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A319099 Number of solutions to x^5 == 1 (mod n).
 * @author Georg Fischer
 */
public class A319099 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A319099() {
    super(1, (p, e) -> Z.valueOf(is5(p) ? (e == 1 ? 1 : 5) : (isMod(5, p, 1) ? 5 : 1)));
  }
}
