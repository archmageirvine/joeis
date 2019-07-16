package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024508.
 * @author Sean A. Irvine
 */
public class A024508 implements Sequence {

  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int cnt = 0;
      for (long x = 1; 2 * x * x < mN; ++x) {
        final long y2 = mN - x * x;
        final long y = LongUtils.sqrt(y2);
        if (y * y == y2 && ++cnt > 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

