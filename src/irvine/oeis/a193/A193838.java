package irvine.oeis.a193;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A193838 Size k of smallest square of k X k lattice points from which n points with distinct mutual distances can be chosen.
 * @author Sean A. Irvine
 */
public class A193838 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mSize = 0;
  private int mN = 0;
  private final HashSet<Integer> mDistances = new HashSet<>();

  private boolean isSolved(final int[] x, final int[] y, final int remaining) {
    if (remaining == 0) {
      if (mVerbose) {
        System.out.println("x=" + Arrays.toString(x) + " y=" + Arrays.toString(y) + " distances=" + mDistances);
      }
      return true;
    }
    for (int k = y[remaining]; k < mSize; ++k) {
      for (int j = k == y[remaining] ? x[remaining] + 1 : 0; j < mSize; ++j) {
        boolean ok = true;
        for (int i = x.length - 1; i >= remaining; --i) {
          final int dx = x[i] - j;
          final int dy = y[i] - k;
          final int d = dx * dx + dy * dy;
          if (!mDistances.add(d)) {
            // Bzzzt, we already have this distance, unwind
            for (int l = x.length - 1; l > i; --l) {
              final int dxl = x[l] - j;
              final int dyl = y[l] - k;
              final int dl = dxl * dxl + dyl * dyl;
              mDistances.remove(dl);
            }
            ok = false;
            break;
          }
        }
        if (ok) {
          // This point is usable
          x[remaining - 1] = j;
          y[remaining - 1] = k;
          if (isSolved(x, y, remaining - 1)) {
            return true;
          }
          for (int i = x.length - 1; i >= remaining; --i) {
            final int dx = x[i] - j;
            final int dy = y[i] - k;
            final int d = dx * dx + dy * dy;
            mDistances.remove(d);
          }
        }
      }
    }
    return false;
  }

  private boolean isSolved(final int size, final int n) {
    // WLOG there must be at least one point on the bottom row
    final int[] x = new int[n];
    final int[] y = new int[n];
    mDistances.clear();
    for (int k = 0; k < size; ++k) {
      x[n - 1] = k;
      if (isSolved(x, y, n - 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isSolved(mSize, mN)) {
      ++mSize;
    }
    return Z.valueOf(mSize);
  }
}
