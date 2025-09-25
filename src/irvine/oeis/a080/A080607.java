package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A080607 Golomb's sequence using multiples of 3.
 * @author Sean A. Irvine
 */
public class A080607 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0, 3);
    mA.set(1, 3);
    mA.set(2, 3);
  }

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      final long u = mA.length();
      final long v = mA.get(++mM);
      for (long k = 0; k < v; ++k) {
        mA.set(u + k, 3 * mM + 3);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
