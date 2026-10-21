package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A086958 m such that A086956(m)=n and A086956(k)=n for exactly one k&lt;m (k=A086957(n)).
 * @author Sean A. Irvine
 */
public class A086958 extends A086956 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) <= 0) {
      ++mM;
      final long v = super.next().longValueExact();
      if (mA.get(v) < 0) {
        mA.set(v, mM);
      } else if (mA.get(v) == 0) {
        mA.set(v, -mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}


