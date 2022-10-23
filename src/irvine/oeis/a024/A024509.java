package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024509 Numbers that are the sum of 2 nonzero squares, including repetitions.
 * @author Sean A. Irvine
 */
public class A024509 extends Sequence1 {

  private long mN = 1;
  private long mC = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long x = 1; 2 * x * x <= mN; ++x) {
        final long y2 = mN - x * x;
        final long y = LongUtils.sqrt(y2);
        if (y * y == y2) {
          ++mC;
        }
      }
    }
    --mC;
    return Z.valueOf(mN);
  }
}

