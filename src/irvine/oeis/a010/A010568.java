package irvine.oeis.a010;

import irvine.math.z.Z;

/**
 * A010568.
 * @author Sean A. Irvine
 */
public class A010568 extends A010575 {

  @Override
  protected long count(final int point) {
    final int t = t(point) - BIAS;
    final int z = z(point) - BIAS;
    final int y = y(point) - BIAS;
    final int x = x(point) - BIAS;
    if (t == 0) {
      if (z == 0) {
        if (y == 0) {
          if (x == -1 || x == 1) {
            return 8;
          }
        } else if (x == 0) {
          if (y == -1 || y == 1) {
            return 8;
          }
        }
      } else if (y == 0 && x == 0) {
        if (z == -1 || z == 1) {
          return 8;
        }
      }
    } else if (z == 0 && y == 0 && x == 0) {
      if (t == -1 || t == 1) {
        return 8;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next();
  }
}
