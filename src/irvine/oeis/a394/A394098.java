package irvine.oeis.a394;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Quadruple;

/**
 * A394098 a(n) is the number of different ways for two particles to reach a corner of an equilateral triangular grid of side n units, starting simultaneously from the other two corners and moving at the same constant speed along the grid lines, such that the distance between each particle and its own starting corner is always increasing and the two particles never meet before arriving the destination.
 * @author Sean A. Irvine
 */
public class A394098 extends Sequence1 {

  // Cf. A394097

  // We use a quadruple to hold (x,y), (u,v) the coordinate pairs of both points.
  // Further, we pretend that both points start at (0,0) and reflect in the vertical
  // axis using x' = n - x - y and y' = y when it is necessary to check where the
  // second particle actually is.
  // We keep track of the number of ways of reaching a configuration (x,y,u,v).

  private static final int[] DELTA_X = {1, 0, -1};
  private static final int[] DELTA_Y = {0, 1,  1};

  private int mN = 0;

  private void update(final HashMap<Quadruple<Integer>, Z> map, final Z value, final int x0, final int y0, final int x1, final int y1, final int u0, final int v0, final int u1, final int v1) {
    if (x1 == mN - u1 - v1 && y1 == v1 && (x1 != 0 || y1 != mN)) {
      return; // end points coincide (except for the final target point)
    }
    // Check if particles traversed the same edge
    // We only need this one way round because we already know (x0,y0) != (u0,v0)
    // Reflect u
    final int w0 = mN - u0 - v0;
    final int w1 = mN - u1 - v1;
    if (w1 == x0 && v1 == y0 && w0 == x1 && v0 == y1) {
      return; // used the same edge
    }
    map.merge(new Quadruple<>(x1, y1, u1, v1), value, Z::add);
  }

  private boolean check(final int x0, final int y0, final int x1, final int y1) {
    // Check that particle remains inside the triangle.
    if (x1 < 0 || y1 < 0 || x1 + y1 > mN || y1 > mN) {
      return false;
    }
    // Check the distance from the origin increases
    final int d0 = x0 * x0 + y0 * y0 + x0 * y0;
    final int d1 = x1 * x1 + y1 * y1 + x1 * y1;
    return d1 > d0; // distance from (0,0) did not increase
  }

//  private void dump(final HashMap<Quadruple<Integer>, Z> counts) {
//    System.out.println("Current states");
//    for (final Map.Entry<Quadruple<Integer>, Z> e : counts.entrySet()) {
//      final Quadruple<Integer> key = e.getKey();
//      System.out.println("(" + key.a() + "," + key.b() + "), (" + (mN - key.c() - key.d()) + "," + key.d() + ") = " + e.getValue());
//    }
//  }

  @Override
  public Z next() {
    ++mN;
    HashMap<Quadruple<Integer>, Z> counts = new HashMap<>();
    counts.put(new Quadruple<>(0, 0, 0, 0), Z.ONE);
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
        if (x == 0 && y == mN && u == 0 && v == mN) {
          // Both points are at end, contribute to the total sum.
          total = total.add(value);
          // No further extension of the paths occurs
        } else if (x == 0 && y == mN) {
          // (x,y) is already complete, only update second point
          for (int k = 0; k < DELTA_X.length; ++k) {
            final int nu = u + DELTA_X[k];
            final int nv = v + DELTA_Y[k];
            if (check(u, v, nu, nv)) {
              update(newCounts, value, x, y, x, y, u, v, nu, nv);
            }
          }
        } else if (u == 0 && v == mN) {
          // (u,v) is already complete, only update first point
          for (int k = 0; k < DELTA_X.length; ++k) {
            final int nx = x + DELTA_X[k];
            final int ny = y + DELTA_Y[k];
            if (check(x, y, nx, ny)) {
              update(newCounts, value, x, y, nx, ny, u, v, u, v);
            }
          }
        } else {
          // General situation, both points move
          for (int k = 0; k < DELTA_X.length; ++k) {
            final int nx = x + DELTA_X[k];
            final int ny = y + DELTA_Y[k];
            if (check(x, y, nx, ny)) {
              for (int j = 0; j < DELTA_X.length; ++j) {
                final int nu = u + DELTA_X[j];
                final int nv = v + DELTA_Y[j];
                if (check(u, v, nu, nv)) {
                  update(newCounts, value, x, y, nx, ny, u, v, nu, nv);
                }
              }
            }
          }
        }
      }
      counts = newCounts;
      //dump(counts);
    }
    return total;
  }
}
