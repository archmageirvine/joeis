package irvine.oeis.a138;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A138507 Expansion of (f(q)^5 / f(q^5) - 1) / 5 in powers of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A138507 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A138507() {
    super(1, (p, e) -> is2(p) ? Z.TWO.negate().pow(e + 1).subtract(1).divide(3) : (is5(p) ? Z.ONE : (isMod(10, p, 3, 7) ? p.negate().pow(e + 1).subtract(1).divide(p.add(1).negate()) : sigmaP(p, e))));
  }
}
