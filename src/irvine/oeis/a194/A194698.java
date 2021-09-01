package irvine.oeis.a194;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A194698 a(n) = floor((n - 1)/12) - floor((n^2 - 1)/(24 * n)).
 * @author Georg Fischer
 */
public class A194698 extends FloorSequence {
  /** Construct the sequence. */
  public A194698() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(mN - 1).divide(CR.valueOf(12)).floor()
        .subtract(CR.valueOf(Z.valueOf(n).square().subtract(Z.ONE)).divide(CR.valueOf(24 * n)).floor());
  }

}
