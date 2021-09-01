package irvine.oeis.a175;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A175269 a(n) = floor(2^sqrt(n)) - floor(n^sqrt(2)).
 * @author Georg Fischer
 */
public class A175269 extends FloorSequence {

  /** Construct the sequence. */
  public A175269() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.TWO.pow(CR.valueOf(n).sqrt()).floor()
        .subtract(CR.valueOf(n).pow(CR.SQRT2).floor());
  }

}
