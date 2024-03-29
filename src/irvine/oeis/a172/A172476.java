package irvine.oeis.a172;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A172476 a(n) = floor(n/sqrt(6)).
 * @author Georg Fischer
 */
public class A172476 extends FloorSequence {
  /** Construct the sequence. */
  public A172476() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).divide(CR.SIX.sqrt()).floor();
  }

}
