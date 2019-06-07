package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005045 Number of restricted <code>3 X 3</code> matrices with row and column sums <code>n</code>.
 * @author Sean A. Irvine
 */
public class A005045 implements Sequence {

  private long mN = -1;

  private long c(final long n, final long i, final long m, final long r) {
    if ((i & 1) == 0 && m + r == i / 2) {
      return (n - 2 * i + m + 2) / 2;
    } else {
      return n - 2 * i + m + 1;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long i = 1; i <= mN - (mN + 2) / 3; ++i) {
      for (long m = Math.max(0, 2 * i - mN); m <= i / 2; ++m) {
        for (long r = 0; r <= i / 2 - m; ++r) {
          s = s.add(c(mN, i, m, r));
        }
      }
    }
    return s;
  }
}
