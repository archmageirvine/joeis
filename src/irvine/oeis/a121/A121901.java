package irvine.oeis.a121;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A121901 a(n) = floor((Pi + e)*sqrt(n)).
 * @author Georg Fischer
 */
public class A121901 extends FloorSequence {
  /** Construct the sequence. */
  public A121901() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.PI.add(CR.E).multiply(CR.valueOf(n).sqrt()).floor();
  }

}
