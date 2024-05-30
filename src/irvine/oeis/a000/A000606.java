package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000606 Number of nonnegative solutions to x^2 + y^2 + z^2 &lt;= n.
 * @author Sean A. Irvine
 */
public class A000606 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long c;
    ++mN;
    c = 0;
    final long lim = Functions.SQRT.l(mN);
    for (long x = 0; x <= lim; ++x) {
      final long xs = x * x;
      for (long y = x; y <= lim; ++y) {
        final long ys = xs + y * y;
        for (long z = y; z <= lim; ++z) {
          if (ys + z * z - mN <= 0) {
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

