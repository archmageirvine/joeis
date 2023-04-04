package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062896 Number of addition triangles with apex n (version 2).
 * @author Sean A. Irvine
 */
public class A062896 extends Sequence1 {

  private int mN = 0;

  private boolean isMin(final int[] row) {
    for (int k = 0, j = row.length - 1; k < row.length / 2; ++k, --j) {
      final int c = Integer.compare(row[k], row[j]);
      if (c > 0) {
        return false;
      }
      if (c < 0) {
        return true;
      }
    }
    return true;
  }

  private long count(final int[] row) {
    long cnt = isMin(row) ? 1 : 0;
    final int[] next = new int[row.length + 1];
    outer:
    for (next[0] = 1; next[0] < row[0]; ++next[0]) {
      for (int k = 1; k < next.length; ++k) {
        next[k] = row[k - 1] - next[k - 1];
        if (next[k] <= 0) {
          continue outer;
        }
      }
      cnt += count(next);
    }
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(new int[] {++mN}));
  }
}
