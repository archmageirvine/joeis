package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014405 Number of arithmetic progressions of 3 or more positive integers, strictly increasing with sum n.
 * @author Sean A. Irvine
 */
public class A014405 extends Sequence1 {

  // After Rick L. Shepherd

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long s = (mN - 3) / 3, st = 1; s > 0; --s, ++st) {
      for (long c = 1; c <= st; ++c) {
        long w = 3 * (s + c);
        long m = 2;
        while (w < mN) {
          w += s + ++m * c;
        }
        if (w == mN) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
