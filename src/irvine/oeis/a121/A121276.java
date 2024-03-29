package irvine.oeis.a121;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A121276 Ceiling((n*Pi)^n).
 * @author Georg Fischer
 */
public class A121276 extends FloorSequence {
  /** Construct the sequence. */
  public A121276() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(CR.PI).pow(n).ceil();
  }

}
