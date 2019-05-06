package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A020949.
 * @author Sean A. Irvine
 */
public class A020949 extends A020945 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;
  private long mK = 0;

  @Override
  public Z next() {
    ++mN;
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
