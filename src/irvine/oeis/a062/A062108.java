package irvine.oeis.a062;
// manually floor at 2021-08-30 14:32

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A062108 a(n) = floor(n^(3/4)).
 * @author Georg Fischer
 */
public class A062108 extends FloorSequence {

  /** Construct the sequence. */
  public A062108() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(n).pow(CR.THREE.divide(CR.FOUR)).floor();
  }
}
