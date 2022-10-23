package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A003996 Sum of distinct nonzero squares in more than one way.
 * @author Sean A. Irvine
 */
public class A003996 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mB = 0;
  private long mN = 0;

  protected byte minCount() {
    return 1;
  }

  protected long power(final long b) {
    return b * b;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (power(mB) <= mN) {
        ++mB;
        final long s = power(mB);
        for (long k = mA.length() - 1; k >= 0; --k) {
          final byte v = mA.get(k);
          if (v != 0) {
            mA.set(k + s, (byte) Math.min(127, v + mA.get(k + s)));
          }
        }
        mA.set(s, (byte) Math.min(127, 1 + mA.get(s)));
      }
      if (mA.get(mN) > minCount()) {
        return Z.valueOf(mN);
      }
    }
  }
}
