package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a002.A002977;
import irvine.util.array.LongDynamicArray;

/**
 * A058361 a(n) is the least k in A002977 with a gap of n. Also n + a(n) is the least k in A007448 which is repeated n times.
 * @author Sean A. Irvine
 */
public class A058361 extends A002977 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private Z mA = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = mA;
      mA = super.next();
      final long d = mA.subtract(t).longValueExact();
      if (mFirsts.get(d) == null) {
        mFirsts.set(d, t);
      }
    }
    return mFirsts.get(mN);
  }
}
