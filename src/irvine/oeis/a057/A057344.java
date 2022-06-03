package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057344 Occurrences of most frequently occurring number in 1-to-n 5-dimensional multiplication table.
 * @author Sean A. Irvine
 */
public class A057344 implements Sequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 6208) {
      // mN^5 exceeds 2^63
      throw new UnsupportedOperationException();
    }
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        for (long i = 1; i <= j; ++i) {
          for (int h = 1; h <= i; ++h) {
            final int m;
            if (k == mN && j == k && i == j && h == i) {
              // aaaaa, multinomial(5; 5)
              m = 1;
            } else if ((j == k && i == j && h == i) || (k == mN && j == k && i == j)) {
              // aaaab, multinomial(5; 4, 1)
              m = 5;
            } else if (k == mN && h == i && (i == j || j == k)) {
              // aaabb, multinomial(5; 3, 2)
              m = 10;
            } else if ((k == mN && j == k) || (h == i && i == j) || (i == j && j == k)) {
              // aaabc, multinomial(5; 3, 1, 1)
              m = 20;
            } else if ((h == i && j == k) || (h == i && k == mN) || (i == j && k == mN)) {
              // aabbc, multinomial(5; 2, 2, 1)
              m = 30;
            } else if (h == i || i == j || j == k || k == mN) {
              // aabcd, multinomial(5; 2, 1, 1, 1)
              m = 60;
            } else {
              // abcde, multinomial(4; 1, 1, 1, 1)
              m = 120;
            }
            final long r = h * i * j * k * mN;
            final long c = mCounts.get(r) + m;
            mCounts.set(r, c);
            if (c > mMax) {
              mMax = c;
            }
          }
        }
      }
    }
    return Z.valueOf(mMax);
  }

//  public Z nextSlow() {
//    ++mN;
//    mCounts.truncate(0);
//    for (long n = 1; n <= mN; ++n) {
//      for (long k = 1; k <= mN; ++k) {
//        for (long j = 1; j <= mN; ++j) {
//          for (long i = 1; i <= mN; ++i) {
//            for (int h = 1; h <= mN; ++h) {
//              final long r = h * i * j * k * n;
//              final long c = mCounts.get(r) + 1;
//              mCounts.set(r, c);
//              if (c > mMax) {
//                mMax = c;
//              }
//            }
//          }
//        }
//      }
//    }
//    return Z.valueOf(mMax);
//  }
}
