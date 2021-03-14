package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A045540 Numbers whose square contains an equal number of each digit that it contains.
 * @author Sean A. Irvine
 */
public class A045540 implements Sequence {

  private long mN = 0;

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(Z.valueOf(n).square());
    int t = -1;
    for (final int v : cnts) {
      if (v != 0) {
        if (t == -1) {
          t = v;
        } else if (t != v) {
          return false;
        }
      }
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
