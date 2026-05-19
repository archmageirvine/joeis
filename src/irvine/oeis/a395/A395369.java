package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A395369 a(n) is the number of pairs (A-&gt;B, B-&gt;A) of non-intersecting paths in a triangular grid ABC of side n units, such that the distance from the starting point to each point of a path is always increasing.
 * @author Sean A. Irvine
 */
public class A395369 extends Sequence1 {

  private static final int BITS = 16; // Pack both coordinates into an integer
  private static final int MASK = (1 << BITS) - 1;
  private static final int[] DELTA_X = {1, 0,  1, -1};
  private static final int[] DELTA_Y = {0, 1, -1, 1};
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private int pack(final int x, final int y) {
    return (x << BITS) + y;
  }

  private boolean isInTriangle(final int x, final int y) {
    // Check that particle remains inside the triangle.
    return x >= 0 && y >= 0 && x + y <= mN;
  }

  private boolean check(final int x0, final int y0, final int x1, final int y1) {
    if (!isInTriangle(x1, y1)) {
      return false;
    }
    // Check the distance from the origin increases
    final int d0 = x0 * x0 + y0 * y0 + x0 * y0;
    final int d1 = x1 * x1 + y1 * y1 + x1 * y1;
    return d1 > d0;
  }

  private void buildPaths(final List<int[]> paths, final List<Integer> path, final int x, final int y) {
    if (x == mN && y == 0) {
      // This next test if efficiency, the first step of the path needs to be consistent
      // with the last because for this sequence one path must lie entirely above the other
      if ((path.get(1) & MASK) == (path.get(path.size() - 2) & MASK)) {
        // Path is complete, take a copy
        paths.add(IntegerUtils.toArray(path));
      }
      return;
    }
    for (int k = 0; k < DELTA_X.length; ++k) {
      final int nx = x + DELTA_X[k];
      final int ny = y + DELTA_Y[k];
      if (check(x, y, nx, ny)) {
        path.add(pack(nx, ny));
        buildPaths(paths, path, nx, ny);
        path.remove(path.size() - 1);
      }
    }
  }

  // Build all paths A -> B
  private List<int[]> buildPaths() {
    final List<int[]> paths = new ArrayList<>();
    final List<Integer> path = new ArrayList<>();
    path.add(pack(0, 0));
    //path.add(pack(1, 0));
    buildPaths(paths, path, 0, 0);
    return paths;
  }

  private int[] transform1(final int[] path) {
    final int[] res = new int[path.length];
    for (int k = 0; k < path.length; ++k) {
      final int p = path[k];
      final int x = p >>> BITS;
      final int y = p & MASK;
      res[k] = pack(mN - x - y, y);
    }
    return res;
  }

  private List<int[]> transform1(final List<int[]> paths) {
    final ArrayList<int[]> res = new ArrayList<>(paths.size());
    for (final int[] path : paths) {
      res.add(transform1(path));
    }
    return res;
  }

  private boolean isOk(final int[] s, final int[] t) {
    // We do not need to check endpoints
    for (int k = 1; k < s.length - 1; ++k) {
      for (int j = 1; j < t.length - 1; ++j) {
        if (s[k] == t[j]) {
          return false;
        }
      }
    }
    return true;
  }


  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long cnt = 0;
    final List<int[]> paths = buildPaths();
    if (mVerbose) {
      StringUtils.message(mN + " paths=" + paths.size());
    }
    final List<int[]> baPaths = transform1(paths);
    for (final int[] ba : baPaths) {
      for (final int[] ab : paths) {
        if (isOk(ab, ba)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
