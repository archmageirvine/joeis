package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057343 Smallest of the most frequently occurring numbers in 1-to-n 4-dimensional multiplication table.
 * @author Sean A. Irvine
 */
public class A057343 implements Sequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mMax = 0;
  private long mArgMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        for (long i = 1; i <= j; ++i) {
          final int m;
          if (k == mN && j == k && i == j) {
            // aaaa, multinomial(4; 4)
            m = 1;
          } else if ((j == k && i == j) || (k == mN && j == k)) {
            // aaab, multinomial(4; 3, 1)
            m = 4;
          } else if (k == mN && i == j) {
            // aabb, multinomial(4; 2, 2)
            m = 6;
          } else if (i == j || j == k || k == mN) {
            // aabc, multinomial(4; 2, 1, 1)
            m = 12;
          } else {
            // abcd, multinomial(4; 1, 1, 1, 1)
            m = 24;
          }
          final long r = i * j * k * mN;
          final long c = mCounts.get(r) + m;
          mCounts.set(r, c);
          if (c >= mMax) {
            if (c > mMax || r < mArgMax) {
              mArgMax = r;
            }
            mMax = c;
          }
        }
      }
    }
    return Z.valueOf(mArgMax);
  }
}
