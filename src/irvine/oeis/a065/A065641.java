package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A065640.
 * @author Sean A. Irvine
 */
public class A065641 extends Sequence0 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      int cnt = 0;
      long m = ++mM;
      do {
        m -= LongUtils.sortDigitsAscending(m);
        ++cnt;
      } while (m != 0);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
