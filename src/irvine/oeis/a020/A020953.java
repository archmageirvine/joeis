package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A020953.
 * @author Sean A. Irvine
 */
public class A020953 extends A020951 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;
  private long mK = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    while (mA.get(mN) == 0) {
      ++mK;
      final long v = super.next().longValueExact();
      if (mA.get(v) == 0) {
        mA.set(v, mK);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
