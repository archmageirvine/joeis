package irvine.oeis.a319;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A319442 Number of divisors of n over the Eisenstein integers.
 * @author Georg Fischer
 */
public class A319442 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A319442() {
    super(1, (p, e) -> is3(p) ? Z.valueOf(2L * e + 1) : Z.valueOf(isMod(3, p, 1) ? (long) e * e + 2L * e + 1 : e + 1));
  }
}
