package irvine.oeis.a000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A000644 Loops of length 4n on square grid that turn at each step and return to start in original direction.
 * @author Sean A. Irvine
 */
public class A000644 implements Sequence {

  private static final int N = 1;
  private static final int S = 2;
  private static final int E = 4;
  private static final int W = 8;
  private static final int NE = N | E;
  private static final int SE = S | E;
  private static final int NW = N | W;
  private static final int SW = S | W;
  private static final int NE_SW = NE | SW; // 15
  private static final int NW_SE = NW | SE | 16; // to distinguish from NE_SW
  private static final int[] OPTIONS = {NE, SE, NW, SW};
  private static final int[] COMPLEMENT = {0, S, N, 0, W, 0, 0, 0, E}; // depends on N=1 etc.

  private int mN = 0;

  private Map<Point, Integer> normalize(final Map<Point, Integer> points) {
    // Move so that every points is north east of (0,0)
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    for (final Point pt : points.keySet()) {
      minX = Math.min(minX, pt.left());
      minY = Math.min(minY, pt.right());
    }
    if (minX == 0 && minY == 0) {
      return points; // already normal
    }
    final Map<Point, Integer> normalized = new HashMap<>(points.size());
    for (final Map.Entry<Point, Integer> e : points.entrySet()) {
      final Point pt = e.getKey();
      normalized.put(new Point(pt.left() - minX, pt.right() - minY), e.getValue());
    }
    return normalized;
  }

  private int reflect(final int v) {
    // do this via table lookup?
    switch (v) {
      case NE_SW:
        return NW_SE;
      case NW_SE:
        return NE_SW;
      case NE:
        return NW;
      case NW:
        return NE;
      case SE:
        return SW;
      case SW:
        return SE;
      default:
        throw new RuntimeException();
    }
  }

  private int rotate(final int v) {
    // do this via table lookup?
    switch (v) {
      case NE_SW:
        return NW_SE;
      case NW_SE:
        return NE_SW;
      case NE:
        return NW;
      case NW:
        return SW;
      case SE:
        return NE;
      case SW:
        return SE;
      default:
        throw new RuntimeException();
    }
  }

  private Map<Point, Integer> reflect(final Map<Point, Integer> points) {
    final Map<Point, Integer> reflect = new HashMap<>(points.size());
    for (final Map.Entry<Point, Integer> e : points.entrySet()) {
      final Point pt = e.getKey();
      reflect.put(new Point(-pt.left(), pt.right()), reflect(e.getValue()));
    }
    return reflect;
  }

  private Map<Point, Integer> rotate(final Map<Point, Integer> points) {
    final Map<Point, Integer> reflect = new HashMap<>(points.size());
    for (final Map.Entry<Point, Integer> e : points.entrySet()) {
      final Point pt = e.getKey();
      reflect.put(new Point(-pt.right(), pt.left()), rotate(e.getValue()));
    }
    return reflect;
  }

  private int state(final Map<Point, Integer> used, final Point p) {
    final Integer v = used.get(p);
    return v == null ? 0 : v;
  }

  private void isomorphism(final Set<Map<Point, Integer>> solutions, final Map<Point, Integer> used) {
    final Map<Point, Integer> normalized = normalize(used);
    if (solutions.contains(normalized)) {
      return;
    }
    Map<Point, Integer> transform = normalized;
    for (int k = 1; k < 4; ++k) {
      transform = normalize(rotate(transform));
      if (solutions.contains(transform)) {
        return;
      }
    }
    transform = normalize(reflect(used));
    if (solutions.contains(transform)) {
      return;
    }
    for (int k = 1; k < 4; ++k) {
      transform = normalize(rotate(transform));
      if (solutions.contains(transform)) {
        return;
      }
    }
    solutions.add(new HashMap<>(normalized));
  }

  private void search(final Set<Map<Point, Integer>> solutions, final Map<Point, Integer> used, final int x, final int y, final int dir, final int remaining) {
    if (remaining == 0) {
      if (x == 0 && y == 0 && dir == S) {
        isomorphism(solutions, used);
      }
      return;
    }
    if (y < 0) {
      return; // We will get these by symmetry
    }
    if (x + y > remaining) {
      return; // Manhattan check, can never make it back
    }
    final int incoming = COMPLEMENT[dir];
    final Point p = new Point(x, y);
    for (final int o : OPTIONS) {
      if ((o & incoming) != 0 && (state(used, p) & o) == 0) {
        final int prevState = state(used, p);
        final int newState = prevState | o;
        // Some juju to distinguish the two possible cases where all four directions are used
        final int storeState = newState == NE_SW && (o == NW || o == SE) ? NW_SE : newState;
        used.put(p, storeState);
        final int outgoing = o ^ incoming;
        switch (outgoing) {
        case N:
          search(solutions, used, x, y + 1, outgoing, remaining - 1);
          break;
        case S:
          search(solutions, used, x, y - 1, outgoing, remaining - 1);
          break;
        case E:
          search(solutions, used, x + 1, y, outgoing, remaining - 1);
          break;
        case W:
          search(solutions, used, x - 1, y, outgoing, remaining - 1);
          break;
        default:
          throw new RuntimeException();
        }
        if (prevState == 0) {
          used.remove(p);
        } else {
          used.put(p, prevState);
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 4;
    final Set<Map<Point, Integer>> solutions = new HashSet<>();
    final Map<Point, Integer> used = new HashMap<>();
    used.put(new Point(0, 0), NE);
    search(solutions, used, 1, 0, E, mN - 1);
    return Z.valueOf(solutions.size());
  }
}
