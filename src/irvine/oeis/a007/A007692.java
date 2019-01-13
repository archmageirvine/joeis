package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A007692.
 * @author Sean A. Irvine
 */
public class A007692 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = 0;
  private long mS = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN > mS * mS) {
        ++mS;
        final long s = mS * mS;
        for (long k = 1; k <= mS; ++k) {
          final long t = s + k * k;
          final byte c = mA.get(t);
          if (c < 2) {
            mA.set(t, (byte) (c + 1));
          }
        }
      }
      if (mA.get(mN) >= 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
