package irvine.oeis.a191;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A191694 a(n) = floor((3^n - 2^n)/n).
 * @author Georg Fischer
 */
public class A191694 extends FloorSequence {
  /** Construct the sequence. */
  public A191694() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.THREE.pow(CR.valueOf(n)).subtract(CR.TWO.pow(CR.valueOf(n))).divide(CR.valueOf(n)).floor();
  }

}
