package irvine.oeis.a052;

import java.util.HashMap;
import java.util.HashSet;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052436.
 * @author Sean A. Irvine
 */
public class A052436 implements Sequence {

  private static final HashMap<String, Character> MAP = new HashMap<>();
  public static final Lattice Z2Q = Lattices.Z2Q;

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

  private static String key(final long... coords) {
    final long ptA = Z2Q.toPoint(coords[0], coords[1]);
    final long ptB = Z2Q.toPoint(coords[2], coords[3]);
    return (ptA - Z2Q.origin()) + "," + (ptB - ptA);
  }

  private static char turn(final long a, final long b, final long c) {
    final String key = (b - a) + "," + (c - b);
    final Character t = MAP.get(key);
    if (t == null) {
      System.out.println("Unknown:" + key + " :: " + Z2Q.toString(a) + " -> " + Z2Q.toString(b) + " -> " + Z2Q.toString(c));
    }
    return t == null ? '?' : t;
  }

  private static String rotate(final String s) {
    final int toggle = s.charAt(0) & 1;
    final char initial = (char) (s.charAt(s.length() - 1) ^ toggle);
    return s.substring(1, s.length() - 2) + s.charAt(0) + '.' + initial;

//    // Rotate by 1
//    if ((s.charAt(0) & 1) == 0) { // right angle
//      return s.substring(1) + s.charAt(0);
//    } else {
//      final StringBuilder sb = new StringBuilder();
//      for (int k = 1; k < s.length(); ++k) {
//        sb.append((char) (s.charAt(k) ^ 32));
//      }
//      sb.append((char) (s.charAt(0) ^ 32));
//      return sb.toString();
//    }
  }

  private static String reverse(final CharSequence s) {
    final StringBuilder rev = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final char t = s.charAt(k);
      if (t >= 'a') {
        rev.append((char) ('`' + (8 - (t - '`'))));
      } else {
        rev.append((char) ('@' + (8 - (t - '@'))));
      }
    }
    return rev.toString();
  }

  private static String mirror(final CharSequence s) {
    final int toggle = 0; //(s.charAt(0) ^ s.charAt(s.length() - 1)) & 32;
    final StringBuilder rev = new StringBuilder();
    for (int k = s.length() - 3; k >= 0; --k) {
      rev.append((char) (s.charAt(k) ^ toggle));
    }
    rev.append('.').append(s.charAt(s.length() - 1));
    return rev.toString();
  }

  private static String canonRotate(String s) {
    String canon = s;
    for (int k = 1; k < s.length(); ++k) {
      s = rotate(s);
      if (s.compareTo(canon) > 0) {
        canon = s;
      }
    }
    return canon;
  }

  private static String canon(final long[] walk) {
    // The last entry of walk is not used!
    final int m = walk.length - 1;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < m; ++k) {
      final long a = walk[k];
      final long b = walk[(k + 1) % m];
      final long c = walk[(k + 2) % m];
      sb.append(turn(a, b, c));
    }
    sb.append('.').append(isDiagonal(walk[0], walk[1]) ? '1' : '0');
    String canon = canonRotate(sb.toString());
    String rc = canonRotate(mirror(sb));
    if (rc.compareTo(canon) > 0) {
      canon = rc;
    }
//    final String rev = reverse(sb);
//    rc = canonRotate(rev);
//    if (rc.compareTo(canon) > 0) {
//      canon = rc;
//    }
//    rc = canonRotate(mirror(rev));
//    if (rc.compareTo(canon) > 0) {
//      canon = rc;
//    }
    //System.out.println("Canon: " + canon);
    return canon; // + "." + diagonalCount(walk); // + (walk[1] == LAT.toPoint(1, 0) ? ".0" : ".1");
  }

  private static boolean isDiagonal(final long prevPt, final long point) {
    final long ax = Z2Q.ordinate(point, 0);
    final long ay = Z2Q.ordinate(point, 1);
    final long bx = Z2Q.ordinate(prevPt, 0);
    final long by = Z2Q.ordinate(prevPt, 1);
    final long dx = ax - bx;
    final long dy = ay - by;
    return dx !=0 && dy != 0;
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
    return sum < 0;
  }

  private static boolean isAcceptable(final long[] walk, final long point, final int remainingSteps) {
    if (Z2Q.ordinate(point, 1) < 0) {
      return false;
    }
    final int t = walk.length - remainingSteps;
//    if (t <= 1) {
//      return true;
//    }
    final long p0 = walk[t - 1];
    final long p1 = walk[t - 2];
    if (point - p0 == p0 - p1) {
      return false; // Avoid two steps in same direction
    }
    // It remains to check there is no X style crossing
    return isAcceptableDiagonal(walk, p0, point, t - 2);
  }

  private static int diagonalCount(final long[] walk) {
    int cnt = 0;
    final int m = walk.length - 1;
    for (int k = 0; k < walk.length - 1; ++k) {
      final long ax = Z2Q.ordinate(walk[k], 0);
      final long ay = Z2Q.ordinate(walk[k], 1);
      final long bx = Z2Q.ordinate(walk[(k + 1) % m], 0);
      final long by = Z2Q.ordinate(walk[(k + 1) % m], 1);
      final long dx = ax - bx;
      final long dy = ay - by;
      if (dx != 0 && dy != 0) {
        ++cnt;
      }
    }
    return cnt;
  }

  private int mN = 0;
  private final HashSet<String> mCanons = new HashSet<>();
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Z2Q) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        return A052436.isAcceptable(mWalk, point, remainingSteps);
      }
    },
    () -> new SelfAvoidingCycler(Z2Q, true) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        return A052436.isAcceptable(mWalk, point, remainingSteps);
      }

      private String toString(final long[] walk) {
        final StringBuilder sb = new StringBuilder();
        for (int k = 0; k < walk.length - 1; ++k) {
          sb.append(mLattice.toString(walk[k])).append(',');
        }
        return sb.toString();
      }

      {
        setAccumulator((walk, weight, axesMask) -> {
//          if (!isAcceptable(mWalk[mWalk.length - 1], 0)) {
//            return;
//          }
          // We need to check that the closing of the cycle obeys the changing direction rules
          if (mWalk[0] - mWalk[mWalk.length - 2] == mWalk[mWalk.length - 2] - mWalk[mWalk.length - 3]) {
            return; // last two pts were in a line
          }
          if (mWalk[1] - mWalk[0] == mWalk[0] - mWalk[mWalk.length - 2]) {
            return; // last two pts were in a line
          }
          if (!isAcceptableDiagonal(mWalk, mWalk[mWalk.length - 2], mWalk[0], mWalk.length)) {
            return; // closing the cycle is an X
          }
          if (!isCounterClockwise(mWalk)) {
            return;
          }
          mCount += weight;
          final String canon = canon(walk);
          //System.out.println(toString(walk) + " wt=" + weight + " " + canon);
          if (mCanons.add(canon)) {
            System.out.println("Retained: " + toString(walk) + " " + canon);
//          } else {
//            System.out.println("Dupe: " + toString(walk) + " " + canon);
          }
        });
      }
    });

  @Override
  public Z next() {
    //return Z.valueOf(mWalker.count(++mN, 1, ~0, LAT.origin()));
    mCanons.clear();
    mWalker.count(++mN, 1, ~0, Z2Q.origin(), Z2Q.neighbour(Z2Q.origin(), 0)); // start +x direction
    mWalker.count(mN, 1, ~0, Z2Q.origin(), Z2Q.neighbour(Z2Q.origin(), 4)); // start +xy direction
    return Z.valueOf(mCanons.size());
  }
}
