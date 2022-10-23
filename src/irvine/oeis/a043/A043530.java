package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A043530 Number of distinct base-3 digits of n.
 * @author Sean A. Irvine
 */
public class A043530 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    int cnt = 0;
    for (final int v : ZUtils.digitCounts(++mN, base())) {
      if (v > 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
