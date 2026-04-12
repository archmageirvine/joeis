package irvine.oeis.a394;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394698 a(n) is the number of different ways to move from A to B along grid paths in an equilateral triangular grid ABC of side n units such that the distance between A and each successive point of the path increases while the direction of movement changes at each grid point.
 * @author Sean A. Irvine
 */
public class A394698 extends Sequence1 {

  // Cf. A394097

  private static final int[] DELTA_X = {1, 0,  1};
  private static final int[] DELTA_Y = {0, 1, -1};

  private static final class State {
    // State is (x,y) and previous direction
    private final int mX;
    private final int mY;
    private final int mD;

    private State(final int x, final int y, final int dir) {
      mX = x;
      mY = y;
      mD = dir;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State o = (State) obj;
      return o.mX == mX && o.mY == mY && o.mD == mD;
    }

    @Override
    public int hashCode() {
      return (mX * 31 + mY) * 31 + mD;
    }

    @Override
    public String toString() {
      return "(" + mX + "," + mY + ")[" + mD + "]";
    }
  }

  private int mN = 0;

  private boolean check(final int x0, final int y0, final int x1, final int y1) {
    // Check that particle remains inside the triangle.
    if (y1 < 0 || x1 + y1 > mN || 2 * y1 > mN) {
      return false;
    }
    // Check the distance from the origin increases
    final int d0 = x0 * x0 + y0 * y0 + x0 * y0;
    final int d1 = x1 * x1 + y1 * y1 + x1 * y1;
    return d1 > d0; // distance from (0,0) did not increase
  }

  @Override
  public Z next() {
    ++mN;
    HashMap<State, Z> counts = new HashMap<>();
    counts.put(new State(0, 0, -1), Z.ONE);
    Z total = Z.ZERO;
    while (!counts.isEmpty()) {
      final HashMap<State, Z> newCounts = new HashMap<>();
      for (final Map.Entry<State, Z> e : counts.entrySet()) {
        final Z value = e.getValue();
        final State key = e.getKey();
        //System.out.println("Expanding " + key);
        final int x = key.mX;
        final int y = key.mY;
        final int dir = key.mD;
        if (x == mN && y == 0) {
          // We reached the end
          total = total.add(value);
          // No further extension of the paths occurs
        } else {
          // Move in all possible ways
          for (int k = 0; k < DELTA_X.length; ++k) {
            if (k != dir) {
              final int nx = x + DELTA_X[k];
              final int ny = y + DELTA_Y[k];
              if (check(x, y, nx, ny)) {
                newCounts.merge(new State(nx, ny, k), value, Z::add);
              }
            }
          }
        }
      }
      counts = newCounts;
    }
    return total;
  }
}
