package irvine.oeis.a261;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A261884 Expansion of (a(q) - a(q^2) - 2*a(q^3) + 2*a(q^6)) / 6 in powers of q where a() is a cubic AGM function.
 * @author Georg Fischer
 */
public class A261884 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A261884() {
    super(1, (p, e) -> is2(p) ? Z.valueOf(neg1(e)) : (is3(p) ? Z.NEG_ONE : Z.valueOf(isMod(6, p, 1) ? e + 1 : oneOr0(e))));
  }
}
