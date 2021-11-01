package irvine.oeis.a051;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A051602 Maximal number of squares that can be formed from n points chosen from the infinite square grid.
 * @author Sean A. Irvine
 */
public class A051602 implements Sequence {

  // Heuristics:
  //
  // 1. All points are assumed to have integer coordinates in the plane.
  // 2. All required points fit in a square of width ceil(sqrt(n)).

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private final HashSet<Point> mCurrentPoints = new HashSet<>();
  private long mBestCount = 0;
  private HashSet<Point> mBestPoints = null;

  // Count the number of squares defined by a set of points (i.e., number of squares
  // such that every corner of the square is in the set of points).
  private long countSquares(final Set<Point> pts) {
    long cnt = 0;
    for (final Point a : pts) {
      for (final Point b : pts) {
        if (a.compareTo(b) < 0) {
          // a and b define an edge of a potential square
          final int dx = b.left() - a.left();
          final int dy = b.right() - a.right();
          final Point c = new Point(b.left() - dy, b.right() + dx);
          if (a.compareTo(c) < 0 && pts.contains(c)) {
            final Point d = new Point(c.left() - dx, c.right() - dy);
            if (a.compareTo(d) < 0 && pts.contains(d)) {
              //System.out.println(a + " -- " + b + " -- " + c + " -- " + d);
              ++cnt;
            }
          }
        }
      }
    }
    return cnt;
  }

  private String colour(final int dx, final int dy) {
    if (dx == 0 || dy == 0) {
      return "gray";
    } else if (Math.abs(dx) == Math.abs(dy)) {
      return "blue";
    } else if (Math.abs(Math.abs(dx) - Math.abs(dy)) == 1) {
      return "green";
    } else {
      return "red";
    }
  }

  // Used to make pictures of solutions
  private void tikz(final Set<Point> pts) {
    if (pts != null) {
      System.out.println("$a(" + pts.size() + ")=" + countSquares(pts) + "$:");
      System.out.println("\\begin{center}");
      System.out.println("\\begin{tikzpicture}");
      for (final Point p : pts) {
        System.out.println("  \\fill " + p + " circle (3pt);");
      }
      System.out.println();
      for (final Point a : pts) {
        for (final Point b : pts) {
          if (a.compareTo(b) < 0) {
            // a and b define an edge of a potential square
            final int dx = b.left() - a.left();
            final int dy = b.right() - a.right();
            final Point c = new Point(b.left() - dy, b.right() + dx);
            if (a.compareTo(c) < 0 && pts.contains(c)) {
              final Point d = new Point(c.left() - dx, c.right() - dy);
              if (pts.contains(d) && a.compareTo(d) < 0) {
                System.out.println("  \\draw [" + colour(dx, dy) + "] " + a + " -- " + b + " -- " + c + " -- " + d + " -- cycle;");
              }
            }
          }
        }
      }
      System.out.println("\\end{tikzpicture}");
      System.out.println("\\end{center}");
    }
  }

  private void search(final Point[] grid, final int k) {
    if (mCurrentPoints.size() == mN) {
      final long cnt = countSquares(mCurrentPoints);
      if (cnt > mBestCount) {
        mBestCount = cnt;
        mBestPoints = new HashSet<>(mCurrentPoints);
      }
      return;
    }
    if (k < grid.length) {
      mCurrentPoints.add(grid[k]);
      search(grid, k + 1);
      mCurrentPoints.remove(grid[k]);
      search(grid, k + 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBestCount = 0;
    mBestPoints = null;
    final int s = (int) Math.ceil(Math.sqrt(mN));
    final Point[] grid = new Point[(s + 1) * (s + 1)];
    for (int z = 0, y = 0; y <= s; ++y) {
      for (int x = 0; x <= s; ++x, ++z) {
        grid[z] = new Point(x, y);
      }
    }
    search(grid, 0);
    if (mVerbose) {
      tikz(mBestPoints);
    }
    return Z.valueOf(mBestCount);
  }
}
