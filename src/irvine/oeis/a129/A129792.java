package irvine.oeis.a129;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A129792 a(n) = ceiling(8^n/n).
 * @author Georg Fischer
 */
public class A129792 extends FloorSequence {
  /** Construct the sequence. */
  public A129792() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.EIGHT.pow(CR.valueOf(n)).divide(CR.valueOf(n)).ceil();
  }

}
