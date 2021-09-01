package irvine.oeis.a191;
// manually floor at 2021-09-01 13:31

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A191152 [4n * e]-2[2n * e], where [ ]=floor.
 * @author Georg Fischer
 */
public class A191152 extends FloorSequence {
  /** Construct the sequence. */
  public A191152() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.E.multiply(CR.valueOf(4 * n)).floor().subtract(CR.E.multiply(CR.valueOf(2 * n)).floor().multiply(Z.TWO));
  }

}
