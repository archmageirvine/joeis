package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A001462 Golomb's sequence: a(n) is the number of times n occurs, starting with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A080606 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0, 2);
    mA.set(1, 2);
  }

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      final long u = mA.length();
      final long v = mA.get(++mM);
      for (long k = 0; k < v; ++k) {
        mA.set(u + k, 2 * mM + 2);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
