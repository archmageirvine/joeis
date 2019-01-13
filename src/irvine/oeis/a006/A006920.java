package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006920.
 * @author Sean A. Irvine
 */
public class A006920 implements Sequence {

  private int[] mCounts = null;

  @Override
  public Z next() {
    if (mCounts == null) {
      mCounts = new int[0];
      return Z.ONE;
    } else if (mCounts.length == 0) {
      mCounts = new int[] {1};
      return Z.ONE;
    }
    final int max = IntegerUtils.max(mCounts);
    final int[] newCounts = Arrays.copyOf(mCounts, max);
    for (final int v : mCounts) {
      if (v > 0) {
        ++newCounts[v - 1];
      }
    }
    mCounts = newCounts;
    final StringBuilder sb = new StringBuilder();
    for (final int cnt : mCounts) {
      sb.append(cnt);
    }
    return new Z(sb.toString());
  }
}
