package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A011973.
 * @author Sean A. Irvine
 */
public class A068779 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long t = ++mM / LongUtils.reverse(mM);
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
