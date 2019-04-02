package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A018890 Smallest expression as sum of positive cubes requires exactly 7 cubes.
 * @author Sean A. Irvine
 */
public class A018890 implements Sequence {

  // This sequence is known to be finite. In fact, last term is likely 8042.

  private final LongDynamicIntArray mRequires = new LongDynamicIntArray();
  private long mN = 0;

  private boolean isRequiresSeven(final long n) {
    long c;
    int min = Integer.MAX_VALUE;
    for (long k = 1; (c = k * k * k) <= n; ++k) {
      min = Math.min(min, 1 + mRequires.get(n - c));
    }
    mRequires.set(n, min);
    return min == 7;
  }

  @Override
  public Z next() {
    while (true) {
      if (isRequiresSeven(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
