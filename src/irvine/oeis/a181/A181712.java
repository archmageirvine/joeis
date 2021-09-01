package irvine.oeis.a181;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A181712 Floor(3 * n * tau)-Floor(2 * n * tau)-Floor(n * tau), where tau=(1+sqrt(5))/2, the golden ratio.
 * @author Georg Fischer
 */
public class A181712 extends FloorSequence {
  /** Construct the sequence */
  public A181712() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    // final CR nTau = CR.valueOf(CR.PHI.multiply(CR.valueOf(n)));
    return CR.PHI.multiply(CR.valueOf(3 * n)).floor()
        .subtract(CR.PHI.multiply(CR.valueOf(2 * n)).floor())
        .subtract(CR.PHI.multiply(CR.valueOf(n)).floor());
  }

}
