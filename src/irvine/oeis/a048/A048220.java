package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicIntArray;

/**
 * A048220 a(n)=least m such that column m of T contains n, array T given by A048212.
 * @author Sean A. Irvine
 */
public class A048220 extends A048212 {

  private final LongDynamicIntArray mFirsts = new LongDynamicIntArray();
  private long mN = 0;
  private int mRow = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mRow;
      for (int k = 0; k < mRow; ++k) {
        final long t = super.next().longValueExact();
        if (mFirsts.get(t) == 0) {
          mFirsts.set(t, k + 1);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
