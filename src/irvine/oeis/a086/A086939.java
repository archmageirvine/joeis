package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A086939 Greatest m with A086571(m) = n.
 * @author Sean A. Irvine
 */
public class A086939 extends A086571 {

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
      } else {
        mA.set(v, -mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}


