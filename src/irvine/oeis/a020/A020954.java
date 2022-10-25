package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A020954 Least k such that A020952(k) = n.
 * @author Sean A. Irvine
 */
public class A020954 extends A020952 {

  {
    setOffset(1);
  }

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;
  private long mK = -1;

  @Override
  public Z next() {
    if (++mN == 2) {
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
