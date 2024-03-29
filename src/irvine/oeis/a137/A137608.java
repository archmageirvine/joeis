package irvine.oeis.a137;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A137608 Expansion of (1 - psi(-q)^3 / psi(-q^3)) / 3 in powers of q where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A137608 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A137608() {
    super(1, (p, e) -> is2(p) ? Z.NEG_ONE : (is3(p) ? Z.ONE : (isMod(6, p, 1) ? Z.valueOf(e + 1) : Z.valueOf(oneOr0(e)))));
  }
}
