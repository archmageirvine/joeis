package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063251 Least number of binary rotations needed to reach fixed point (with either left or right rotation allowed at each iteration).
 * @author Sean A. Irvine
 */
public class A063251 extends Sequence0 {

  private long mN = -1;
  private long mBest = 0;

  private void search(final long n, final int cnt) {
    if (cnt >= mBest) {
      return;
    }
    final long right = LongUtils.rotateRight(n);
    if (right == n) {
      mBest = cnt;
      return;
    }
    final long left = LongUtils.rotateLeft(n);
    if (left == n) {
      mBest = cnt;
      return;
    }
    search(right, cnt + 1);
    if (cnt + 1 < mBest) {
      search(left, cnt + 1);
    }
  }

  @Override
  public Z next() {
    mBest = Long.MAX_VALUE;
    search(++mN, 0);
    return Z.valueOf(mBest);
  }
}
