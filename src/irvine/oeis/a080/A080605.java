package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A080605 Golomb's sequence using odd integers.
 * @author Sean A. Irvine
 */
public class A080605 extends Sequence1 {

  private long mN = -1;
  private long mM = 1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0, 1);
    mA.set(1, 3);
    mA.set(2, 3);
    mA.set(3, 3);
  }

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      final long u = mA.length();
      final long v = mA.get(++mM);
      for (long k = 0; k < v; ++k) {
        mA.set(u + k, 2 * mM + 1);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
