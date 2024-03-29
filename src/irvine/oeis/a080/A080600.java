package irvine.oeis.a080;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A080600 a(n) = ceiling(n*(3 + sqrt(13))/2).
 * @author Georg Fischer
 */
public class A080600 extends FloorSequence {
  /** Construct the sequence. */
  public A080600() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.HALF.multiply(CR.valueOf(n)).multiply(CR.THREE.add(CR.valueOf(13).sqrt())).ceil();
  }

}
