package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A061262 Smallest number representable as the sum of 3 triangular numbers in exactly n ways.
 * @author Sean A. Irvine
 */
public class A061262 extends Sequence1 {

  private final LongDynamicIntArray mWays = new LongDynamicIntArray();
  private int mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      if (++k >= mM) {
        final long t = ++mM * (mM + 1) / 2;
        for (long a = 0; a <= mM; ++a) {
          final long ta = a * (a + 1) / 2;
          for (long b = a; b <= mM; ++b) {
            final long tb = b * (b + 1) / 2;
            final long s = t + ta + tb;
            mWays.set(s, mWays.get(s) + 1);
          }
        }
        k = 0;
      }
      if (mWays.get(k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
