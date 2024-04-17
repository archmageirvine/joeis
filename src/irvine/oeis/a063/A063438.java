package irvine.oeis.a063;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A063438 a(n) = floor((n+1)*Pi) - floor(n*Pi).
 * @author Georg Fischer
 */
public class A063438 extends FloorSequence {

  /** Construct the sequence. */
  public A063438() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(n + 1).multiply(CR.PI).floor()
        .subtract(CR.valueOf(n).multiply(CR.PI).floor());
  }

}
