package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A077268 Number of bases in which n requires at least one zero to be written.
 * @author Sean A. Irvine
 */
public class A077268 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (int base = 2; base <= mN; ++base) {
      if (ZUtils.digitCounts(mN, base)[0] > 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
