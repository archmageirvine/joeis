package irvine.oeis.a384;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384728 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A384728 extends Sequence1 {

  private int mN = 0;
  private final HashSet<Long> mRoots = new HashSet<>();

  private void sqrtCount(final int pos, final long x, final long y, final int xcnt, final int ycnt) {
    // pos is position in infinite word
    // x is sqrt
    // y is sqrt
    // xcnt is number of bits in x
    // ycnt is number of bits in y
    // As we proceed, y always matches prefix of x
    if (pos == 2 * mN) {
      mRoots.add(x);
      return; // we found a sqrt
    }
    final long bit = (pos >> 1) & 1;
    if (xcnt < mN) {
      // We can try adding this bit to x
      sqrtCount(pos + 1, (x << 1) + bit, y, xcnt + 1, ycnt);
    }
    if (ycnt < xcnt) { // WLOG we can assume length of y never exceeds length of x
      // We can try adding this bit to y
      final long y1 = (y << 1) + bit;
      // Check y starts the same way as x
      if ((x >>> (xcnt - ycnt - 1)) == y1) {
        sqrtCount(pos + 1, x, y1, xcnt, ycnt + 1);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 64) {
      throw new UnsupportedOperationException();
    }
    mRoots.clear();
    sqrtCount(0, 0, 0, 0, 0);
    return Z.valueOf(mRoots.size());
  }
}

