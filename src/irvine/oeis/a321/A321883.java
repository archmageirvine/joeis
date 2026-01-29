package irvine.oeis.a321;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A321883 Nonnegative integers n for which n! + 1 is not a square.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A321883 extends Sequence1 {

  private static final long LIMIT = 1000000000L; // known search limit for A146968
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > LIMIT) {
      throw new UnsupportedOperationException();
    }
    if (mN == 4) {
      mN = 6;
    } else if (mN == 7) {
      mN = 8;
    }
    return Z.valueOf(mN);
  }
}
