package irvine.oeis.a052;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052436 Number of canonical polygons of n sides.
 * @author Sean A. Irvine
 */
public class A052436 extends Sequence1 {

  // Uses the canonicalization procedure described by Lars Blomberg

  private static final Lattice Z2Q = Lattices.Z2Q;
  private static final Map<String, Character> MAP = new HashMap<>();
  static {
    MAP.put(key(1, 0, 0, 1), '1');
    MAP.put(key(1, 0, 1, 1), '2');
    MAP.put(key(1, 0, 2, 1), '3');
    MAP.put(key(1, 0, 2, -1), '5');
    MAP.put(key(1, 0, 1, -1), '6');
    MAP.put(key(1, 0, 0, -1), '7');

    MAP.put(key(1, 1, 0, 1), '1');
    MAP.put(key(1, 1, 0, 2), '2');
    MAP.put(key(1, 1, 1, 2), '3');
    MAP.put(key(1, 1, 2, 1), '5');
    MAP.put(key(1, 1, 2, 0), '6');
    MAP.put(key(1, 1, 1, 0), '7');

    MAP.put(key(0, 1, -1, 0), '1');
    MAP.put(key(0, 1, -1, 1), '2');
    MAP.put(key(0, 1, -1, 2), '3');
    MAP.put(key(0, 1, 1, 2), '5');
    MAP.put(key(0, 1, 1, 1), '6');
    MAP.put(key(0, 1, 1, 0), '7');

    MAP.put(key(-1, 1, -1, 0), '1');
    MAP.put(key(-1, 1, -2, 0), '2');
    MAP.put(key(-1, 1, -2, 1), '3');
    MAP.put(key(-1, 1, -1, 2), '5');
    MAP.put(key(-1, 1, 0, 2), '6');
    MAP.put(key(-1, 1, 0, 1), '7');

    MAP.put(key(-1, 0, 0, -1), '1');
    MAP.put(key(-1, 0, -1, -1), '2');
    MAP.put(key(-1, 0, -2, -1), '3');
    MAP.put(key(-1, 0, -2, 1), '5');
    MAP.put(key(-1, 0, -1, 1), '6');
    MAP.put(key(-1, 0, 0, 1), '7');

    MAP.put(key(-1, -1, 0, -1), '1');
    MAP.put(key(-1, -1, 0, -2), '2');
    MAP.put(key(-1, -1, -1, -2), '3');
    MAP.put(key(-1, -1, -2, -1), '5');
    MAP.put(key(-1, -1, -2, 0), '6');
    MAP.put(key(-1, -1, -1, 0), '7');

    MAP.put(key(0, -1, 1, 0), '1');
    MAP.put(key(0, -1, 1, -1), '2');
    MAP.put(key(0, -1, 1, -2), '3');
    MAP.put(key(0, -1, -1, -2), '5');
    MAP.put(key(0, -1, -1, -1), '6');
    MAP.put(key(0, -1, -1, 0), '7');

    MAP.put(key(1, -1, 1, 0), '1');
    MAP.put(key(1, -1, 2, 0), '2');
    MAP.put(key(1, -1, 2, -1), '3');
    MAP.put(key(1, -1, 1, -2), '5');
    MAP.put(key(1, -1, 0, -2), '6');
    MAP.put(key(1, -1, 0, -1), '7');
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private static String key(final long... coords) {
    final long ptA = Z2Q.toPoint(coords[0], coords[1]);
    final long ptB = Z2Q.toPoint(coords[2], coords[3]);
    return (ptA - Z2Q.origin()) + "," + (ptB - ptA);
  }

  private static char turn(final long a, final long b, final long c) {
    final String key = (b - a) + "," + (c - b);
    return MAP.get(key);
  }

  private static String rotate(final String s) {
    final int toggle = s.charAt(0) & 1;
    final char initial = (char) (s.charAt(s.length() - 1) ^ toggle);
    return s.substring(1, s.length() - 2) + s.charAt(0) + '.' + initial;
  }

  private static String mirror(final CharSequence s) {
    final StringBuilder rev = new StringBuilder();
    for (int k = s.length() - 3; k >= 0; --k) {
      rev.append(s.charAt(k));
    }
    rev.append('.').append(s.charAt(s.length() - 1));
    return rev.toString();
  }

  private static String canonRotate(String s) {
    String canon = s;
    for (int k = 1; k < s.length(); ++k) {
      s = rotate(s);
      canon = max(canon, s);
    }
    return canon;
  }

  private static String max(final String a, final String b) {
    return a.compareTo(b) > 0 ? a : b;
  }

  private static StringBuilder code(final long[] walk) {
    final int m = walk.length - 1;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < m; ++k) {
      final long a = walk[k];
      final long b = walk[(k + 1) % m];
      final long c = walk[(k + 2) % m];
      sb.append(turn(a, b, c));
    }
    sb.append('.').append(isDiagonal(walk[0], walk[1]) ? '1' : '0');
    return sb;
  }

  private static String canon(final long[] walk) {
    final StringBuilder sb = code(walk);
    return max(canonRotate(sb.toString()), canonRotate(mirror(sb)));
  }

  private static boolean isDiagonal(final long prevPt, final long point) {
    final long ax = Z2Q.ordinate(point, 0);
    final long ay = Z2Q.ordinate(point, 1);
    final long bx = Z2Q.ordinate(prevPt, 0);
    final long by = Z2Q.ordinate(prevPt, 1);
    final long dx = ax - bx;
    final long dy = ay - by;
    return dx != 0 && dy != 0;
  }

  private static boolean isAcceptableDiagonal(final long[] walk, final long prevPt, final long point, final int t) {
    final long ax = Z2Q.ordinate(point, 0);
    final long ay = Z2Q.ordinate(point, 1);
    final long bx = Z2Q.ordinate(prevPt, 0);
    final long by = Z2Q.ordinate(prevPt, 1);
    final long dx = ax - bx;
    final long dy = ay - by;
    if (dx == 0 || dy == 0) {
      return true; // line is vertical or horizontal
    }
    // Line a -- b is diagonal
    // Construct the other two corners of the square (i.e. a -- ap -- b -- bp -- a is a square of unit size)
    final long ap = Z2Q.toPoint(ax, by);
    final long bp = Z2Q.toPoint(bx, ay);
    // If ap -- bp, or bp -- ap occurs in path so far then we must reject new point
    for (int k = 0; k < t; ++k) {
      if (walk[k] == ap && walk[k + 1] == bp) {
        return false;
      }
      if (walk[k] == bp && walk[k + 1] == ap) {
        return false;
      }
    }
    return true;
  }

  private static boolean isCounterClockwise(final long[] walk) {
    long sum = 0;
    final int m = walk.length - 1;
    for (int k = 0; k < walk.length - 1; ++k) {
      final long ax = Z2Q.ordinate(walk[k], 0);
      final long ay = Z2Q.ordinate(walk[k], 1);
      final long bx = Z2Q.ordinate(walk[(k + 1) % m], 0);
      final long by = Z2Q.ordinate(walk[(k + 1) % m], 1);
      sum += (bx - ax) * (by + ay);
    }
    return sum <= 0;
  }

  private static boolean isAcceptable(final long[] walk, final long point, final int remainingSteps) {
    final int t = walk.length - remainingSteps;
    final long p0 = walk[t - 1];
    final long p1 = walk[t - 2];
    if (point - p0 == p0 - p1) {
      return false; // Avoid two steps in same direction
    }
    // It remains to check there is no X style crossing
    return isAcceptableDiagonal(walk, p0, point, t - 2);
  }

  private static String toString(final long[] walk) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < walk.length - 1; ++k) {
      sb.append(Z2Q.toString(walk[k])).append(',');
    }
    return sb.toString();
  }

  private int mN = 0;
  private final Set<String> mCanons = Collections.synchronizedSet(new HashSet<>());
  private final Walker mWalker = new SelfAvoidingCycler(Z2Q, true) {
    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      if (!super.isAcceptable(point, remainingSteps)) {
        return false;
      }
      return A052436.isAcceptable(mWalk, point, remainingSteps);
    }

    {
      setAccumulator((walk, weight, axesMask) -> {
        // We need to check that the closing of the cycle obeys the changing direction rules
        if (walk[0] - walk[walk.length - 2] == walk[walk.length - 2] - walk[walk.length - 3]) {
          return; // last two pts were in a line
        }
        if (walk[1] - walk[0] == walk[0] - walk[walk.length - 2]) {
          return; // last two pts were in a line
        }
        if (!isAcceptableDiagonal(walk, walk[walk.length - 2], walk[0], walk.length)) {
          return; // closing the cycle is an X
        }
        if (!isCounterClockwise(walk)) {
          return;
        }
        if (mCanons.add(canon(walk)) && mVerbose) {
          System.out.println("Retained: " + mCanons.size() + " " + A052436.toString(walk));
        }
      });
    }
  };

  @Override
  public Z next() {
    mCanons.clear();
    mWalker.count(++mN, 1, ~0, Z2Q.origin(), Z2Q.toPoint(1, 0)); // start +x direction
    mWalker.count(mN, 1, ~0, Z2Q.origin(), Z2Q.toPoint(1, 1)); // start +xy direction
    if (mVerbose) {
      System.out.println(mCanons);
    }
    return Z.valueOf(mCanons.size());
  }
}
