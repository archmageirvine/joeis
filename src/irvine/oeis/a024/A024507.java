package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024507.
 * @author Sean A. Irvine
 */
public class A024507 implements Sequence {

  private long mN = 4;
  private long mC = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      ++mN;
      for (long x = 1; 2 * x * x < mN; ++x) {
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

