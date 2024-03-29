package irvine.oeis.a248;
// Generated by gen_seq4.pl floor at 2021-08-31 21:27

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A248739 a(n) = 29*n + ceiling(n/29).
 * @author Georg Fischer
 */
public class A248739 extends FloorSequence {
  /** Construct the sequence. */
  public A248739() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(29).multiply(Z.valueOf(n)).add(CR.valueOf(n).divide(CR.valueOf(29)).ceil());
  }

}
