package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A033283 n-th number whose maximal base 10 run length is 2.
 * @author Sean A. Irvine
 */
public class A033283 implements Sequence {

  private long mN = Long.parseLong(StringUtils.rep('1', target())) - 1;

  private int maximalRunLength(long n) {
    int max = 0;
    long prev = -1;
    int cnt = 0;
    while (n != 0) {
      final long r = n % 10;
      if (r == prev) {
        ++cnt;
      } else {
        if (cnt > max) {
          max = cnt;
        }
        cnt = 1;
        prev = r;
      }
      n /= 10;
    }
    return Math.max(max, cnt);
  }

  protected int target() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      if (maximalRunLength(++mN) == target()) {
        return Z.valueOf(mN);
      }
    }
  }
}

