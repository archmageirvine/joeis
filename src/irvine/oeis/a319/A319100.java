package irvine.oeis.a319;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A319100 Number of solutions to x^6 == 1 (mod n).
 * @author Georg Fischer
 */
public class A319100 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A319100() {
    super(1, (p, e) -> is2(p) ? (e <= 2 ? p.pow(e - 1) : Z.FOUR) : (is3(p) ? Z.valueOf(e == 1 ? 2 : 6) : Z.valueOf(isMod(6, p, 1) ? 6 : 2)));
  }
}
