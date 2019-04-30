package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A307672.
 * @author Sean A. Irvine
 */
public class A307672 implements Sequence {

  private static final byte[][] EXPAND = {{4, 0, 5}, {5, 1, 3}, {3, 2, 4}, {2, 3, 1}, {0, 4, 2}, {1, 5, 0}};
  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0L, (byte) 0);
    mA.set(1L, (byte) 5);
  }
  private long mPos = -1;
  private long mExpand = 0;

  @Override
  public Z next() {
    if (++mPos >= mA.length()) {
      for (final byte v : EXPAND[mA.get(++mExpand)]) {
        mA.set(mA.length(), v);
      }
    }
    return Z.valueOf(mA.get(mPos));
  }
}
