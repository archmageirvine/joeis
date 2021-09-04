package irvine.oeis.a327;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A327298 a(n) = floor(3*n*Pi) - 3*floor(n*Pi).
 * @author Georg Fischer
 */
public class A327298 extends FloorSequence {

  /** Construct the sequence. */
  public A327298() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.THREE.multiply(CR.valueOf(n)).multiply(CR.PI).floor().subtract(Z.THREE.multiply(CR.valueOf(n).multiply(CR.PI).floor()));
  }

}
