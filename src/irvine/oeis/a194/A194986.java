package irvine.oeis.a194;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A194986 a(n) = 1 + floor(n/sqrt(6)).
 * @author Georg Fischer
 */
public class A194986 extends FloorSequence {
  /** Construct the sequence. */
  public A194986() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.ONE.add(CR.valueOf(n).divide(CR.SIX.sqrt()).floor());
  }

}
