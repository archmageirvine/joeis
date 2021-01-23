package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a002.A002487;
import irvine.util.array.LongDynamicLongArray;

/**
 * A020946 a(n) is the smallest number k such that A002487(k) = n.
 * @author Sean A. Irvine
 */
public class A020946 extends A002487 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mK = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
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
