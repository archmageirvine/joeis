package irvine.oeis.a181;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A181059 a(n) = floor(sin(n) - cos(n)).
 * @author Georg Fischer
 */
public class A181059 extends FloorSequence {
  /** Construct the sequence. */
  public A181059() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).sin().subtract(CR.valueOf(n).cos()).floor();
  }

}
