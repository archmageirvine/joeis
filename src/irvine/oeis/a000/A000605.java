package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000605 Number of points of norm &lt;= n in cubic lattice.
 * @author Sean A. Irvine
 */
public class A000605 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c;
    ++mN;
    c = 0;
    final long s = mN * mN;
    for (long x = 0; x <= mN; ++x) {
      final long xs = x * x;
      final long mx = x == 0 ? 1 : 2;
      for (long y = x; y <= mN; ++y) {
        final long ys = xs + y * y;
        final long my = mx * (y == 0 ? 1 : 2);
        for (long z = y; z <= mN; ++z) {
          final long mz = my * (z == 0 ? 1 : 2);
          if (ys + z * z - s <= 0) {
            if (y == x) {
              if (y == z) {
                c += mz;
              } else {
                c += 3 * mz;
              }
            } else if (y == z || x == z) {
              c += 3 * mz;
            } else {
              c += 6 * mz;
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}

