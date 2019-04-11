package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000604 Number of nonnegative solutions to <code>x^2 +</code> y^2 + z^2 <code>&lt;= n^2</code>.
 * @author Sean A. Irvine
 */
public class A000604 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c;
    ++mN;
    c = 0;
    final long s = mN * mN;
    for (long x = 0; x <= mN; ++x) {
      final long xs = x * x;
      for (long y = x; y <= mN; ++y) {
        final long ys = xs + y * y;
        for (long z = y; z <= mN; ++z) {
          if (ys + z * z - s <= 0) {
            if (y == x) {
              if (y == z) {
                ++c;
              } else {
                c += 3;
              }
            } else if (y == z || x == z) {
              c += 3;
            } else {
              c += 6;
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}

