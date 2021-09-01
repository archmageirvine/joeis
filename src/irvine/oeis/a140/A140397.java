package irvine.oeis.a140;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A140397 a(n) = floor(3 * phi * n) - 3 * floor(phi * n) where phi = (1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A140397 extends FloorSequence {

  /** Construct the sequence */
  public A140397() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.PHI.multiply(CR.valueOf(3 * n)).floor()
        .subtract(Z.THREE.multiply(CR.PHI.multiply(CR.valueOf(n)).floor()));
  }

}
