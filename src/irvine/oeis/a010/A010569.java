package irvine.oeis.a010;

import irvine.math.z.Z;

/**
 * A010569 <code>2n-step 5-dimensional</code> closed paths on 5-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010569 extends A010576 {

  @Override
  protected boolean check(final long point, final int n) {
    if (!super.check(point, n)) {
      return false;
    }
    final long u = u(point) - BIAS;
    final long t = t(point) - BIAS;
    final long z = z(point) - BIAS;
    final long y = y(point) - BIAS;
    final long x = x(point) - BIAS;
    return Math.abs(u) + Math.abs(t) + Math.abs(z) + Math.abs(y) + Math.abs(x) <= mN - n;
  }

  @Override
  protected long count(final long point) {
    final long u = u(point) - BIAS;
    final long t = t(point) - BIAS;
    final long z = z(point) - BIAS;
    final long y = y(point) - BIAS;
    final long x = x(point) - BIAS;
    if (u == 0) {
      if (t == 0) {
        if (z == 0) {
          if (y == 0) {
            if (x == -1 || x == 1) {
              return 10;
            }
          } else if (x == 0) {
            if (y == -1 || y == 1) {
              return 10;
            }
          }
        } else if (y == 0 && x == 0) {
          if (z == -1 || z == 1) {
            return 10;
          }
        }
      } else if (z == 0 && y == 0 && x == 0) {
        if (t == -1 || t == 1) {
          return 10;
        }
      }
    } else if (t == 0 && z == 0 && y == 0 && x == 0) {
      if (u == -1 || u == 1) {
        return 10;
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
