package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicLongArray;

/**
 * A072916 Number of m such that Floor[Prime[m]/m] = n.
 * @author Sean A. Irvine
 */
public class A072916 extends A000040 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z p = super.next();
      final long v = p.divide(++mM).longValueExact();
      mCounts.increment(v);
      if (v > mN + 1) {
        return Z.valueOf(mCounts.get(mN));
      }
    }
  }
}

