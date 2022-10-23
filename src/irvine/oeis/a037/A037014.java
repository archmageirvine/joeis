package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037014 Numbers n with property that reading binary expansion from right to left (from least significant to most significant), run lengths do not increase.
 * @author Sean A. Irvine
 */
public class A037014 extends Sequence1 {

  private long mN = -1;

  private boolean is(long n) {
    int prevLength = Integer.MAX_VALUE;
    while (n != 0) {
      final long bit = n & 1;
      int cnt = 0;
      do {
        ++cnt;
        n >>>= 1;
      } while ((n & 1) == bit);
      if (cnt > prevLength) {
        return false;
      }
      prevLength = cnt;
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
