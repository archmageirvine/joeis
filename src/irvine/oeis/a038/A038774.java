package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A038774 Cycle lengths of the permutation that converts the forest of depth-first planar planted binary trees into breadth-first representation.
 * @author Sean A. Irvine
 */
public class A038774 extends A038776 {

  private static final long USED = -1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      if (mA.get(mN) == USED) {
        continue;
      }
      long cnt = 0;
      do {
        while (mA.get(m) == 0) {
          mA.set(++mM, super.next().longValueExact());
        }
        ++cnt;
        final long t = mA.get(m);
        mA.set(m, USED);
        m = t;
      } while (m != mN);
      return Z.valueOf(cnt);
    }
  }
}
