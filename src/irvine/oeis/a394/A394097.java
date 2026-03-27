package irvine.oeis.a394;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393796.
 * @author Sean A. Irvine
 */
public class A394097 extends Sequence1 {

  // todo this is somehow still plain wrong

  private int mN = 0;
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int x, final int y, final int u, final int v) {
      if (y == v && x == mN - u - v) {
        // Points have collided
        // Note this reflects (u,v) in x-axis to (n-u-v,v)
        return Z.ZERO;
      }
      if (x == 0 && y == 0 && u == 0 && v == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      if (x == 0 && y == 0) {
        // (x,y) is already complete
        if (u > 0) {
          sum = sum.add(get(x, y, u - 1, v));
        }
        if (v > 0) {
          sum = sum.add(get(x, y, u, v - 1));
        }
        if (u > 0 && v < u - 1) {
          sum = sum.add(get(x, y, u - 1, v + 1));
        }
      } else if (u == 0 && v == 0) {
        // (u,v) is already complete
        if (x > 0) {
          sum = sum.add(get(x - 1, y, u, v));
        }
        if (y > 0) {
          sum = sum.add(get(x, y - 1, u, v));
        }
        if (x > 0 && y < x - 1) {
          sum = sum.add(get(x - 1, y + 1, u, v));
        }
      } else {
        if (x > 0) {
          if (u > 0 && !isSameEdge(x, y, x - 1, y, u, v, u - 1, v)) {
            sum = sum.add(get(x - 1, y, u - 1, v));
          }
          if (v > 0 && !isSameEdge(x, y, x - 1, y, u, v, u, v - 1)) {
            sum = sum.add(get(x - 1, y, u, v - 1));
          }
          if (u > 0 && v < u - 1 && !isSameEdge(x, y, x - 1, y, u, v, u - 1, v + 1)) {
            sum = sum.add(get(x - 1, y, u - 1, v + 1));
          }
        }
        if (y > 0) {
          if (u > 0 && !isSameEdge(x, y, x, y - 1, u, v, u - 1, v)) {
            sum = sum.add(get(x, y - 1, u - 1, v));
          }
          if (v > 0 && !isSameEdge(x, y, x, y - 1, u, v, u, v - 1)) {
            sum = sum.add(get(x, y - 1, u, v - 1));
          }
          if (u > 0 && v < u - 1 && !isSameEdge(x, y, x, y - 1, u, v, u - 1, v + 1)) {
            sum = sum.add(get(x, y - 1, u - 1, v + 1));
          }
        }
        if (x > 0 && y < x - 1) {
          if (u > 0 && !isSameEdge(x, y, x - 1, y + 1, u, v, u - 1, v)) {
            sum = sum.add(get(x - 1, y + 1, u - 1, v));
          }
          if (v > 0 && !isSameEdge(x, y, x - 1, y + 1, u, v, u, v - 1)) {
            sum = sum.add(get(x - 1, y + 1, u, v - 1));
          }
          if (u > 0 && v < u - 1 && !isSameEdge(x, y, x - 1, y + 1, u, v, u - 1, v + 1)) {
            sum = sum.add(get(x - 1, y + 1, u - 1, v + 1));
          }
        }
      }
      return sum;
    }

    @Override
    public Z get(final int a, final int b, final int c, final int d) {
      final Z t = super.get(a, b, c, d);
      System.out.println("(" + a + "," + b + "), (" + (mN - c - d) + "," + d + ") = " + t);
      return t;
    }
  };

  private boolean isSameEdge(final int x0, final int y0, final int x1, final int y1, final int u0, final int v0, final int u1, final int v1) {
    // Reflect u
    final int w0 = mN - u0 - v0;
    final int w1 = mN - u1 - v1;
    return (w0 == x0 && v0 == y0 && w1 == x1 && v1 == y1) || (w1 == x0 && v1 == y0 && w0 == x1 && v0 == y1);
  }

  @Override
  public Z next() {
    mB.clear(); // Depends on n, so reset
    return mB.get(++mN, 0, mN, 0);
  }
}

