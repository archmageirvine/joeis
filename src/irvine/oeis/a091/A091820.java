package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A091820 Number of ways to reach a sum of n by a down-only cascade through Pascal's Triangle, starting at <code>C(0,0)=1</code> at the apex and shifting left or right by exactly one position at each step.
 * @author Sean A. Irvine
 */
public class A091820 implements Sequence {

  private int mN = 0;
  private final ArrayList<int[]> mPascal = new ArrayList<>();
  {
    mPascal.add(new int[] {1});
  }

  private long count(final int sum, final int y, final int x) {
    final int v = mPascal.get(y)[x];
    if (v < 0) {
      return 0;
    }
    final int s = sum + v;
    if (s >= mN) {
      return s == mN ? 1 : 0;
    }
    return count(s, y + 1, x) + count(s, y + 1, x + 1);
  }

  @Override
  public Z next() {
    final int[] prev = mPascal.get(mN);
    ++mN;
    final int[] row = new int[mN + 1];
    for (int k = 0; k < row.length; ++k) {
      final int a = k > 0 ? prev[k - 1] : 0;
      final int b = k >= prev.length ? 0 : prev[k];
      if (a == -1 || b == -1) {
        row[k] = -1;
      } else {
        final long t = a + (long) b;
        if (t > Integer.MAX_VALUE) {
          row[k] = -1;
        } else {
          row[k] = (int) t;
        }
      }
    }
    mPascal.add(row);
    return Z.valueOf(count(0, 0, 0));
  }
}

