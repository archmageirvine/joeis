package irvine.oeis.a060;
// manually floor at 2021-08-30 09:14

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A060419 a(n) = floor(3^log_2(n)).
 * @author Georg Fischer
 */
public class A060419 extends FloorSequence {

  /** Construct the sequence. */
  public A060419() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return n == 0 ? Z.ZERO : CR.THREE.pow(CR.valueOf(n).log().divide(CR.TWO.log())).floor();
  }

}
