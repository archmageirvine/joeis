package irvine.oeis.a094;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A094093 a(n) = ceiling((sqrt n)^(sqrt n)).
 * @author Georg Fischer
 */
public class A094093 extends FloorSequence {
  /** Construct the sequence. */
  public A094093() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).sqrt().pow(CR.valueOf(n).sqrt()).ceil();
  }

}
