package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A049050 Least p with exactly n distinct factorial numbers == 1 (mod p).
 * @author Sean A. Irvine
 */
public class A049050 extends A000040 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long p = super.next().longValueExact();
      int cnt = 1;
      long f = 1;
      long m = 1;
      while (f != 0) {
        f *= ++m;
        f %= p;
        if (f == 1) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, p);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
