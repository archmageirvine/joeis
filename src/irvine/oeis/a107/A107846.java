package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A107846 Number of duplicate digits of n.
 * @author Georg Fischer
 */
public class A107846 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    int[] counts = ZUtils.digitCounts(Z.valueOf(mN), 10);
    int dupl = 0;
    for (int i = 0; i < 10; ++i) {
      if (counts[i] >= 2) {
        dupl += counts[i] - 1;
      }
    }
    return Z.valueOf(dupl);
  }
}
