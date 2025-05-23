package irvine.oeis.a240;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A240734 a(n) = floor(6^n/(2+sqrt(5))^n).
 * @author Georg Fischer
 */
public class A240734 extends FloorSequence {
  /** Construct the sequence. */
  public A240734() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.SIX.pow(n).divide(CR.TWO.add(CR.FIVE.sqrt()).pow(n)).floor();
  }

}
