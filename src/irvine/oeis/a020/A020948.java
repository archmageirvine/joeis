package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A020948 Least k such that b(k) = n, where b( ) is sequence A020944.
 * @author Sean A. Irvine
 */
public class A020948 extends A020944 {

  {
    super.next();
  }

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
