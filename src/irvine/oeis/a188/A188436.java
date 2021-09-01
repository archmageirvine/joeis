package irvine.oeis.a188;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A188436 [3r]-[nr]-[3r-nr], where r=(1+sqrt(5))/2 and [.]=floor.
 * @author Georg Fischer
 */
public class A188436 extends FloorSequence {

  /** Construct the sequence */
  public A188436() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.THREE.multiply(CR.PHI).floor()
        .subtract(CR.PHI.multiply(CR.valueOf(n)).floor())
        .subtract(CR.THREE.multiply(CR.PHI).subtract(CR.PHI.multiply(CR.valueOf(n))).floor());
  }

}
