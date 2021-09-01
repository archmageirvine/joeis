package irvine.oeis.a190;
// manually floor at 2021-09-01 13:31

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A190843 [2ne]-2[ne], where [ ]=floor.
 * @author Georg Fischer
 */
public class A190843 extends FloorSequence {
  /** Construct the sequence. */
  public A190843() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.E.multiply(CR.valueOf(2 * n)).floor().subtract(CR.E.multiply(CR.valueOf(n)).floor().multiply(Z.TWO));
  }

}
