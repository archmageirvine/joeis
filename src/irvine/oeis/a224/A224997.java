package irvine.oeis.a224;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A224997 Floor(1/f(x^(1/n))) for x = 17, where f computes the fractional part.
 * @author Georg Fischer
 */
public class A224997 extends FloorSequence {

  private final CR mR = CR.valueOf(17);

  /** Construct the sequence. */
  public A224997() {
    super(2);
  }

  protected Z evalCR(final long n) {
    return CR.ONE.divide(mR.pow(CR.ONE.divide(CR.valueOf(n))).frac()).floor();
  }

}
