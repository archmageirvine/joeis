package irvine.oeis.a248;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A248873 a(n) = floor(e^(n+1) - e^n).
 * @author Georg Fischer
 */
public class A248873 extends FloorSequence {
  /** Construct the sequence. */
  public A248873() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.E.pow(CR.valueOf(n).add(CR.ONE)).subtract(CR.E.pow(n)).floor();
  }

}
