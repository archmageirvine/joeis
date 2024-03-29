package irvine.oeis.a135;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A135660 a(n) = ceiling(sqrt(n) - n^(1/3)).
 * @author Georg Fischer
 */
public class A135660 extends FloorSequence {
  /** Construct the sequence. */
  public A135660() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).sqrt().subtract(CR.valueOf(n).pow(CR.ONE.divide(CR.THREE))).ceil();
  }

}
