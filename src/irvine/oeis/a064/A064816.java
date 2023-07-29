package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064816 Numbers which are the sums of two positive triangular numbers (A000217) in exactly two different ways.
 * @author Sean A. Irvine
 */
public class A064816 extends Sequence1 {

  private long mN = 15;

  private boolean is(final long n) {
    long k = 0;
    long cnt = 0;
    while (true) {
      final long t = ++k * (k + 1) / 2;
      if (2 * t > n) {
        break;
      }
      if (LongUtils.isTriangular(n - t) && ++cnt > 2) {
        break;
      }
    }
    return cnt == 2;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

