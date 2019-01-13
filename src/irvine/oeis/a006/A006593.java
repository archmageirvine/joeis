package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a046.A046081;
import irvine.util.array.LongDynamicLongArray;

/**
 * A006593.
 * @author Sean A. Irvine
 */
public class A006593 extends A046081 {

  private LongDynamicLongArray mFirst = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      ++mM;
      final long v = super.next().longValueExact();
      if (mFirst.get(v) == 0) {
        mFirst.set(v, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}
