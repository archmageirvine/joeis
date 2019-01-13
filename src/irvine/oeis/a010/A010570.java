package irvine.oeis.a010;

import irvine.math.z.Z;

/**
 * A010570.
 * @author Sean A. Irvine
 */
public class A010570 extends A010577 {

  @Override
  protected long count(final long point) {
    final long v = v(point) - BIAS;
    final long u = u(point) - BIAS;
    final long t = t(point) - BIAS;
    final long z = z(point) - BIAS;
    final long y = y(point) - BIAS;
    final long x = x(point) - BIAS;
    if (v == 0) {
      if (u == 0) {
        if (t == 0) {
          if (z == 0) {
            if (y == 0) {
              if (x == -1 || x == 1) {
                return 12;
              }
            } else if (x == 0) {
              if (y == -1 || y == 1) {
                return 12;
              }
            }
          } else if (y == 0 && x == 0) {
            if (z == -1 || z == 1) {
              return 12;
            }
          }
        } else if (z == 0 && y == 0 && x == 0) {
          if (t == -1 || t == 1) {
            return 12;
          }
        }
      } else if (t == 0 && z == 0 && y == 0 && x == 0) {
        if (u == -1 || u == 1) {
          return 12;
        }
      }
    } else if (u == 0 && t == 0 && z == 0 && y == 0 && x == 0) {
      if (v == -1 || v == 1) {
        return 12;
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
