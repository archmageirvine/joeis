package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A086959 Greatest m with A086956(m)=n.
 * @author Sean A. Irvine
 */
public class A086959 extends A086956 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) <= 0) {
      ++mM;
      final long v = super.next().longValueExact();
      if (mA.get(v) == -2) {
        mA.set(v, mM);
      } else {
        mA.add(v, -1);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}


