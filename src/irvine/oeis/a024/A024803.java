package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024803 Numbers that are the sum of 3 distinct nonzero squares, including repetitions.
 * @author Sean A. Irvine
 */
public class A024803 implements Sequence {

  private long mN = 13;
  private long mC = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long x = 1; 3 * x * x < mN; ++x) {
        final long u = mN - x * x;
        for (long y = x + 1; 2 * y * y < u; ++y) {
          final long v = u - y * y;
          final long s = LongUtils.sqrt(v);
          if (s * s == v) {
            ++mC;
          }
        }
      }
    }
    --mC;
    return Z.valueOf(mN);
  }
}
