package irvine.oeis.a102;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A102475 a(n) = floor(Pi^(n/2)).
 * @author Georg Fischer
 */
public class A102475 extends FloorSequence {
  /** Construct the sequence. */
  public A102475() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.PI.pow(CR.valueOf(n).divide(CR.TWO)).floor();
  }

}
