package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A099054.
 * @author Sean A. Irvine
 */
public class A099054 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(1, (byte) 1);
    mA.set(2, (byte) 2);
    mA.set(3, (byte) 3);
  }
  private int mN = 0;
  private int mExpandPos = 1;

  @Override
  public Z next() {
    final long n = mA.length();
    if (++mN >= n) {
      ++mExpandPos;
      if ((mExpandPos & 1) == 0) {
        switch (mA.get(mExpandPos)) {
          case 1:
            mA.set(n, (byte) 3);
            mA.set(n + 1, (byte) 2);
            mA.set(n + 2, (byte) 1);
            break;
          case 2:
            mA.set(n, (byte) 1);
            mA.set(n + 1, (byte) 3);
            mA.set(n + 2, (byte) 2);
            break;
          default:
            mA.set(n, (byte) 2);
            mA.set(n + 1, (byte) 1);
            mA.set(n + 2, (byte) 3);
            break;
        }
      } else {
        switch (mA.get(mExpandPos)) {
          case 1:
            mA.set(n, (byte) 1);
            mA.set(n + 1, (byte) 2);
            mA.set(n + 2, (byte) 3);
            break;
          case 2:
            mA.set(n, (byte) 2);
            mA.set(n + 1, (byte) 3);
            mA.set(n + 2, (byte) 1);
            break;
          default:
            mA.set(n, (byte) 3);
            mA.set(n + 1, (byte) 1);
            mA.set(n + 2, (byte) 2);
            break;
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
