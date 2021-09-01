package irvine.oeis.a191;
// manually floor at 2021-09-01 13:41

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A191188 a(n) = floor(8 * n * Pi) - 2 * floor(4 * n * Pi).
 * @author Georg Fischer
 */
public class A191188 extends FloorSequence {
  /** Construct the sequence. */
  public A191188() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.PI.multiply(CR.valueOf(8 * n)).floor().subtract(CR.PI.multiply(CR.valueOf(4 * n)).floor().multiply(Z.TWO));
  }

}
