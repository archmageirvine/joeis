package irvine.oeis.a394;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Quadruple;

/**
 * A393796.
 * @author Sean A. Irvine
 */
public class A394097 extends Sequence1 {

  // todo this is somehow wrong

  private int mN = 0;
  private boolean isSameEdge(final int x0, final int y0, final int x1, final int y1, final int u0, final int v0, final int u1, final int v1) {
    // Reflect u
    final int w0 = mN - u0 - v0;
    final int w1 = mN - u1 - v1;
    return (w0 == x0 && v0 == y0 && w1 == x1 && v1 == y1) || (w1 == x0 && v1 == y0 && w0 == x1 && v0 == y1);
  }

  private void update(final HashMap<Quadruple<Integer>, Z> map, final Z value, final int x0, final int y0, final int x1, final int y1, final int u0, final int v0, final int u1, final int v1) {
    if (x1 == mN - u1 - v1 && y1 == v1) {
      return; // points coincide
    }
    if (isSameEdge(x0, y0, x1, y1, u0, v0, u1, v1)) {
      return; // used the same edge
    }
    map.merge(new Quadruple<>(x1, y1, u1, v1), value, Z::add);
  }

  @Override
  public Z next() {
    ++mN;
    HashMap<Quadruple<Integer>, Z> counts = new HashMap<>();
    counts.put(new Quadruple<>(mN, 0, mN, 0), Z.ONE);
    Z total = Z.ZERO;
    while (!counts.isEmpty()) {
      final HashMap<Quadruple<Integer>, Z> newCounts = new HashMap<>();
      for (final Map.Entry<Quadruple<Integer>, Z> e : counts.entrySet()) {
        final Z value = e.getValue();
        final Quadruple<Integer> key = e.getKey();
        final int x = key.a();
        final int y = key.b();
        final int u = key.c();
        final int v = key.d();
        if (x == 0 && y == 0 && u == 0 && v == 0) {
          total = total.add(value);
          continue;
        }
        if (x == 0 && y == 0) {
          // (x,y) is already complete
          if (u > 0) {
            update(newCounts, value, x, y, x, y, u, v, u - 1, v);
          }
          if (v > 0) {
            update(newCounts, value, x, y, x, y, u, v, u, v - 1);
          }
          if (u > 0 && v < u - 1) {
            update(newCounts, value, x, y, x, y, u, v, u - 1, v + 1);
          }
        } else if (u == 0 && v == 0) {
          // (u,v) is already complete
          if (x > 0) {
            update(newCounts, value, x, y, x - 1, y, u, v, u, v);
          }
          if (y > 0) {
            update(newCounts, value, x, y, x, y - 1, u, v, u, v);
          }
          if (x > 0 && y < x - 1) {
            update(newCounts, value, x, y, x - 1, y + 1, u, v, u, v);
          }
        } else {
          if (x > 0) {
            if (u > 0) {
              update(newCounts, value, x, y, x - 1, y, u, v, u - 1, v);
            }
            if (v > 0) {
              update(newCounts, value, x, y, x - 1, y, u, v, u, v - 1);
            }
            if (u > 0 && v < u - 1) {
              update(newCounts, value, x, y, x - 1, y, u, v, u - 1, v + 1);
            }
          }
          if (y > 0) {
            if (u > 0) {
              update(newCounts, value, x, y, x, y - 1, u, v, u - 1, v);
            }
            if (v > 0) {
              update(newCounts, value, x, y, x, y - 1, u, v, u, v - 1);
            }
            if (u > 0 && v < u - 1) {
              update(newCounts, value, x, y, x, y - 1, u, v, u - 1, v + 1);
            }
          }
          if (x > 0 && y < x - 1) {
            if (u > 0) {
              update(newCounts, value, x, y, x - 1, y + 1, u, v, u - 1, v);
            }
            if (v > 0) {
              update(newCounts, value, x, y, x - 1, y + 1, u, v, u, v - 1);
            }
            if (u > 0 && v < u - 1) {
              update(newCounts, value, x, y, x - 1, y + 1, u, v, u - 1, v + 1);
            }
          }
        }
      }
      counts = newCounts;
    }
    return total;
  }
}

