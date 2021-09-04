package irvine.oeis.a090;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A090676 a(n) = round(n^3/12) - floor(n/4)*floor((n+2)/4).
 * @author Georg Fischer
 */
public class A090676 extends FloorSequence {

  /** Construct the sequence. */
  public A090676() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(Z.valueOf(n).pow(3)).divide(CR.valueOf(12)).round()
        .subtract(Z.valueOf(mN / 4).multiply(Z.valueOf((mN + 2) / 4)));
  }

}
