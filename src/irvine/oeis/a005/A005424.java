package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a116.A116550;
import irvine.util.array.LongDynamicLongArray;

/**
 * A005424 Smallest number that requires n iterations of the bi-unitary totient function (A116550) to reach 1.
 * @author Sean A. Irvine
 */
public class A005424 extends A116550 {

  private final LongDynamicLongArray mA116550 = new LongDynamicLongArray();
  private long mN = 0;
  private long mA = 1;
  private long mB = 1;

  private long iteratedCount(final long nn) {
    while (nn >= mA) {
      mA116550.set(mA++, super.next().longValueExact());
    }
    long cnt = 0;
    long n = nn;
    while (n != 1) {
      ++cnt;
      n = mA116550.get(n);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (iteratedCount(mB) < mN) {
      ++mB;
    }
    return Z.valueOf(mB);
  }
}
