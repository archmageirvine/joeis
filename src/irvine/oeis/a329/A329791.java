package irvine.oeis.a329;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A329791 a(n) = floor(sqrt(2) * n) + floor(sqrt(3) * n).
 * @author Georg Fischer
 */
public class A329791 extends FloorSequence {

  /** Construct the sequence. */
  public A329791() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.SQRT2.multiply(CR.valueOf(n)).floor().add(CR.THREE.sqrt().multiply(CR.valueOf(n)).floor());
  }

}
