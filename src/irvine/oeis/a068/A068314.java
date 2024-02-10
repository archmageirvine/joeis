package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a034.A034178;
import irvine.util.array.LongDynamicLongArray;

/**
 * A068314 Smallest integer that can be expressed as the sum of consecutive odd numbers in exactly n ways.
 * @author Sean A. Irvine
 */
public class A068314 extends A034178 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final long t = super.next().longValueExact();
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
