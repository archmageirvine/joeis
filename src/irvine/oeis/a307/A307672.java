package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A307672 allocated for Bradley Klee.
 * @author Sean A. Irvine
 */
public class A307672 implements Sequence {

  private static final byte[][] EXPAND = {{5, 0, 1}, {2, 1, 0}, {1, 2, 3}, {4, 3, 2}, {3, 4, 5}, {0, 5, 4}};
  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0L, (byte) 0);
    mA.set(1L, (byte) 1);
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
