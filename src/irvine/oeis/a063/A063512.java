package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a007.A007617;
import irvine.util.array.DynamicLongArray;

/**
 * A063512 Least number starting a chain of exactly 2n-1 consecutive integers that do not have totient inverses.
 * @author Sean A. Irvine
 */
public class A063512 extends A007617 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mA = super.next().longValueExact();
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    while (mFirsts.get(mN) == 0) {
      int length = 1;
      final long start = mA;
      while (true) {
        final long t = mA;
        mA = super.next().longValueExact();
        if (mA - t != 1) {
          break;
        }
        ++length;
      }
      if (mFirsts.get(length) == 0) {
        mFirsts.set(length, start);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
