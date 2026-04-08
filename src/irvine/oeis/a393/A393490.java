package irvine.oeis.a393;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394098 a(n) is the number of different ways for two particles to reach a corner of an equilateral triangular grid of side n units, starting simultaneously from the other two corners and moving at the same constant speed along the grid lines, such that the distance between each particle and its own starting corner is always increasing and the two particles never meet before arriving the destination.
 * @author Sean A. Irvine
 */
public class A393490 extends Sequence1 {

  // Cf. A394097

  // We hold (x,y), (u,v), (s, t) the coordinate pairs of the three points.
  // Further, we pretend that all points start at (0,0) and reflect in axes
  // when it is necessary to check for collisions.
  // We keep track of the number of ways of reaching a configuration (x,y,u,v,s,t).

  private static final int[] DELTA_X = {1, 0, -1};
  private static final int[] DELTA_Y = {0, 1,  1};
  private static final int[] DELTA_0 = {0};

  private static final class State {
    // State is really three points (x,y), (u,v), (s,t)
    private final int mX;
    private final int mY;
    private final int mU;
    private final int mV;
    private final int mS;
    private final int mT;

    private State(final int x, final int y, final int u, final int v, final int s, final int t) {
      mX = x;
      mY = y;
      mU = u;
      mV = v;
      mS = s;
      mT = t;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State o = (State) obj;
      return o.mX == mX && o.mY == mY && o.mU == mU && o.mV == mV && o.mS == mS && o.mT == mT;
    }

    @Override
    public int hashCode() {
      return ((((mX * 31 + mY) * 31 + mU) * 31 + mV) * 31 + mS) * 31 + mT;
    }
  }

  private int mN = 0;

  private void update(final HashMap<State, Z> map, final Z value, final int x0, final int y0, final int x1, final int y1, final int u0, final int v0, final int u1, final int v1, final int s0, final int t0, final int s1, final int t1) {
    final int w1 = mN - u1 - v1;
    if (x1 == w1 && y1 == v1) {
      return; // Points (x,y) and (u,v) coincide
    }
    final int r1 = mN - s1 - t1;
    if (x1 == s1 && y1 == r1) {
      return; // Points (x,y) and (s,t) coincide
    }
    if (w1 == s1 && v1 == r1) {
      return; // Points (u,v) and (s,t) coincide
    }

    // Check if particles traversed the same edge
    // We only need this one way round for each pair (because e.g. we already know (x0,y0) != (u0,v0))
    final int w0 = mN - u0 - v0;
    if (w1 == x0 && v1 == y0 && w0 == x1 && v0 == y1) {
      return; // used the same edge
    }
    final int r0 = mN - s0 - t0;
    if (s0 == x0 && r1 == y0 && s0 == x1 && r0 == y1) {
      return; // used the same edge
    }
    if (s0 == w0 && r1 == v0 && s0 == w1 && r0 == v1) {
      return; // used the same edge
    }
    map.merge(new State(x1, y1, u1, v1, s1, t1), value, Z::add);
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

  private void dump(final HashMap<State, Z> counts) {
    System.out.println("Current states");
    for (final Map.Entry<State, Z> e : counts.entrySet()) {
      final State key = e.getKey();
      System.out.println("(" + key.mX + "," + key.mY + "), (" + key.mU + "," + key.mV + "), (" + key.mS + "," + key.mT + ") transforms to: (" + key.mX + "," + key.mY + "), (" + (mN - key.mU - key.mV) + "," + key.mV + "), (" + key.mS + "," + (mN - key.mS - key.mT) + ") = " + e.getValue());
    }
  }

  @Override
  public Z next() {
    ++mN;
    HashMap<State, Z> counts = new HashMap<>();
    counts.put(new State(0, 0, 0, 0, 0, 0), Z.ONE);
    Z total = Z.ZERO;
    while (!counts.isEmpty()) {
      final HashMap<State, Z> newCounts = new HashMap<>();
      for (final Map.Entry<State, Z> e : counts.entrySet()) {
        final Z value = e.getValue();
        final State key = e.getKey();
        final int x = key.mX;
        final int y = key.mY;
        final int u = key.mU;
        final int v = key.mV;
        final int s = key.mS;
        final int t = key.mT;
        if (x == mN && y == 0 && u == mN && v == 0 && s == mN && t == 0) {
          // All points are at end, contribute to the total sum.
          total = total.add(value);
          // No further extension of the paths occurs
        } else {
          // Work out which points need to move
          final int[] dkx = x == mN && y == 0 ? DELTA_0 : DELTA_X;
          final int[] dky = x == mN && y == 0 ? DELTA_0 : DELTA_Y;
          final int[] djx = u == mN && v == 0 ? DELTA_0 : DELTA_X;
          final int[] djy = u == mN && v == 0 ? DELTA_0 : DELTA_Y;
          final int[] dix = s == mN && t == 0 ? DELTA_0 : DELTA_X;
          final int[] diy = s == mN && t == 0 ? DELTA_0 : DELTA_Y;
          // Move in all possible ways
          for (int k = 0; k < dkx.length; ++k) {
            final int nx = x + dkx[k];
            final int ny = y + dky[k];
            if (check(x, y, nx, ny)) {
              for (int j = 0; j < djx.length; ++j) {
                final int nu = u + djx[j];
                final int nv = v + djy[j];
                if (check(u, v, nu, nv)) {
                  for (int i = 0; i < dix.length; ++i) {
                    final int ns = s + dix[i];
                    final int nt = t + diy[i];
                    if (check(s, t, ns, nt)) {
                      update(newCounts, value, x, y, nx, ny, u, v, nu, nv, s, t, ns, nt);
                    }
                  }
                }
              }
            }
          }
        }
      }
      counts = newCounts;
      dump(counts);
    }
    return total;
  }
}
