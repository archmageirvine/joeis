package irvine.oeis.a084;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A084794 a(n) = floor( 1/frac(n*Pi/4) ).
 * @author Georg Fischer
 */
public class A084794 extends FloorSequence {
  /** Construct the sequence. */
  public A084794() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.ONE.divide(CR.valueOf(n).multiply(CR.PI).divide(CR.FOUR).frac()).floor();
  }

}
