package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034165 Number of 'zig-zag' self-avoiding walks on an n X n lattice from a corner to opposite one.
 * @author Sean A. Irvine
 */
public class A034165 implements Sequence {

  // Not competitive for large terms ...

  private final int[] mWorkspace = new int[1000]; // Way larger than we can hope to do here
  private long mC = 0;
  protected long mMaxLength = 0;
  private int mN = -1;

  private int pack(final int x, final int y) {
    return (x << 16) + y;
  }

  private boolean contains(final int x, final int y, final int length) {
    final int p = pack(x, y);
    for (int k = length - 1; k >= 0; --k) {
      if (mWorkspace[k] == p) {
        return true;
      }
    }
    return false;
  }

  private void count(final int x, final int y, final int length, final boolean wasHorizontal) {
    if (x == mN && y == mN) {
      ++mC;
      if (length > mMaxLength) {
        mMaxLength = length;
      }
      return;
    }
    mWorkspace[length] = pack(x, y);
    if (wasHorizontal) {
      if (y < mN && !contains(x, y + 1, length)) {
        count(x, y + 1, length + 1, false);
      }
      if (y > 0 && x != 0 && x != mN && !contains(x, y - 1, length)) {
        count(x, y - 1, length + 1, false);
      }
    } else {
      if (x < mN && !contains(x + 1, y, length)) {
        count(x + 1, y, length + 1, true);
      }
      if (x > 0 && y != 0 && y != mN && !contains(x - 1, y, length)) {
        count(x - 1, y, length + 1, true);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mC = 0;
    count(1, 0, 1, true);
    return Z.valueOf(mC).multiply2();
  }
}

