package irvine.oeis.a327;
// manually floor at 2021-09-01 13:58

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A327211 a(n) = [(2n+2)e] - [(n+2)e] - [ne], where [ ] = floor.
 * @author Georg Fischer
 */
public class A327211 extends FloorSequence {
  /** Construct the sequence */
  public A327211() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.E.multiply(CR.valueOf(2 * mN + 2)).floor()
        .subtract(CR.E.multiply(CR.valueOf(mN + 2)).floor())
        .subtract(CR.E.multiply(CR.valueOf(n)).floor());
  }

}
