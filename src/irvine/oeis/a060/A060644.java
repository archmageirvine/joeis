package irvine.oeis.a060;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A060644 a(n) = floor((n+1)^(n+1)/n^n).
 * @author Georg Fischer
 */
public class A060644 extends FloorSequence {
  /** Construct the sequence. */
  public A060644() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).add(CR.ONE).pow(CR.valueOf(n).add(CR.ONE)).divide(CR.valueOf(n).pow(n)).floor();
  }

}
