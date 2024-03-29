package irvine.oeis.a062;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A062368 Multiplicative with a(p^e) = (e+1)*(e+2)*(4*e+3)/6.
 * @author Georg Fischer
 */
public class A062368 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A062368() {
    super(1, (p, e) -> Z.valueOf(e + 1).multiply(e + 2).multiply(4L * e + 3).divide(6));
  }
}
