package irvine.oeis.a393;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393490 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A393490 extends Sequence1 {

  // Cf. A394097

  // We hold (x,y), (u,v), (s, t) the coordinate pairs of the three points;
  // starting at (0,0), (n,0), and (0,n), respectively.
  // The target points are (n,0), (0,n), and (0,0), respectively.
  // We keep track of the number of ways of reaching a configuration (x,y,u,v,s,t).

  private static final int[] DELTA_X = {1, 0,  1};
  private static final int[] DELTA_Y = {0, 1, -1};
  private static final int[] DELTA_U = {-1, 0, -1};
  private static final int[] DELTA_V = { 0, 1,  1};
  private static final int[] DELTA_S = {-1,  0, 1};
  private static final int[] DELTA_T = { 0, -1, -1};
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

    @Override
    public String toString() {
      return "(" + mX + "," + mY + "), (" + mU + "," + mV + "), (" + mS + "," + mT + ")";
    }
  }

  private int mN = 0;

  private void update(final HashMap<State, Z> map, final Z value, final int x0, final int y0, final int x1, final int y1, final int u0, final int v0, final int u1, final int v1, final int s0, final int t0, final int s1, final int t1) {
    if (x1 == u1 && y1 == v1) {
      return; // Points (x,y) and (u,v) coincide
    }
    if (x1 == s1 && y1 == t1) {
      return; // Points (x,y) and (s,t) coincide
    }
    if (u1 == s1 && v1 == t1) {
      return; // Points (u,v) and (s,t) coincide
    }

    // Check if particles traversed the same edge
    // We only need this one way round for each pair (because e.g. we already know (x0,y0) != (u0,v0))
    if (u1 == x0 && v1 == y0 && u0 == x1 && v0 == y1) {
      return; // used the same edge
    }
    if (s1 == x0 && t1 == y0 && s0 == x1 && t0 == y1) {
      return; // used the same edge
    }
    if (s1 == u0 && t1 == v0 && s0 == u1 && t0 == v1) {
      return; // used the same edge
    }
    map.merge(new State(x1, y1, u1, v1, s1, t1), value, Z::add);
  }

  private boolean isInTriangle(final int x, final int y) {
    // Check that particle remains inside the triangle.
    return x >= 0 && y >= 0 && x + y <= mN;
  }

  private boolean check(final int x0, final int y0, final int x1, final int y1) {
    if (!isInTriangle(x1, y1)) {
      return false;
    }
    if (x0 == x1 && y0 == y1) {
      return true; // This is a stationary point
    }
    // Check the distance from the origin increases
    final int d0 = x0 * x0 + y0 * y0 + x0 * y0;
    final int d1 = x1 * x1 + y1 * y1 + x1 * y1;
    return d1 > d0;
  }

//  private void dump(final HashMap<State, Z> counts) {
//    System.out.println("Current states");
//    for (final Map.Entry<State, Z> e : counts.entrySet()) {
//      final State key = e.getKey();
//      System.out.println(key + " = " + e.getValue());
//    }
//  }

  @Override
  public Z next() {
    ++mN;
    HashMap<State, Z> counts = new HashMap<>();
    counts.put(new State(0, 0, mN, 0, 0, mN), Z.ONE);
    Z total = Z.ZERO;
    while (!counts.isEmpty()) {
      final HashMap<State, Z> newCounts = new HashMap<>();
      for (final Map.Entry<State, Z> e : counts.entrySet()) {
        final Z value = e.getValue();
        final State key = e.getKey();
        //System.out.println("Expanding " + key);
        final int x = key.mX;
        final int y = key.mY;
        final int u = key.mU;
        final int v = key.mV;
        final int s = key.mS;
        final int t = key.mT;
        if (x == mN && y == 0 && u == 0 && v == mN && s == 0 && t == 0) {
          // All points are at end, contribute to the total sum.
          total = total.add(value);
          // No further extension of the paths occurs
        } else {
          // Work out which points need to move
          final int[] dx = x == mN && y == 0 ? DELTA_0 : DELTA_X;
          final int[] dy = x == mN && y == 0 ? DELTA_0 : DELTA_Y;
          final int[] du = u == 0 && v == mN ? DELTA_0 : DELTA_U;
          final int[] dv = u == 0 && v == mN ? DELTA_0 : DELTA_V;
          final int[] ds = s == 0 && t == 0 ? DELTA_0 : DELTA_S;
          final int[] dt = s == 0 && t == 0 ? DELTA_0 : DELTA_T;
          // Move in all possible ways
          for (int k = 0; k < dx.length; ++k) {
            final int nx = x + dx[k];
            final int ny = y + dy[k];
            if (check(x, y, nx, ny)) {
              for (int j = 0; j < du.length; ++j) {
                final int nu = u + du[j];
                final int nv = v + dv[j];
                if (check(mN - u - v, v, mN - nu - nv, nv)) { // symmetry for distance check
                  for (int i = 0; i < ds.length; ++i) {
                    final int ns = s + ds[i];
                    final int nt = t + dt[i];
                    if (check(s, mN - s - t, ns, mN - ns - nt)) { // symmetry for distance check
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
      //dump(counts);
    }
    return total;
  }
}
