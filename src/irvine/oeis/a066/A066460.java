package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A066460 a(n) is the least positive integer k such that k is a repdigit number in exactly n different bases B, where 1&lt;B&lt;k.
 * @author Sean A. Irvine
 */
public class A066460 extends Sequence0 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 1;

  private int countRepDigits(final long m) {
    int cnt = 0;
    for (long k = 2; k < m; ++k) {
      if (LongUtils.isRepDigit(m, k)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    while (mFirsts.get(mN) == 0) {
      final int cnt = countRepDigits(++mM);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

