package irvine.oeis.a384;

import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A384616 allocated for Sela Fried.
 * @author Sean A. Irvine
 */
public class A384616 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mM = 0;

  private long sum(final int[][] neighbours, final int[] p) {
    long s = 0;
    for (int k = 0; k < neighbours.length; ++k) {
      for (int j = 0; j < neighbours[k].length; ++j) {
        s += Math.abs(p[k] - p[neighbours[k][j]]);
      }
    }
    return s;
  }

  private int[][] buildNeighbours(final int n, final int m) {
    // Build in a way that each adjacency is only counted once
    final int[][] neighbours = new int[n * m][];
    final Lattice grid = Lattices.grid(n, m);
    for (int x = 0; x < n; ++x) {
      for (int y = 0; y < m; ++y) {
        final long p = grid.toPoint(x, y);
        final int nc = grid.neighbourCount(p);
        final int row = y * n + x;
        final List<Integer> lst = new ArrayList<>();
        for (int k = 0; k < nc; ++k) {
          final long q = grid.neighbour(p, k);
          if (q > p) {
            lst.add((int) (grid.ordinate(q, 1) * n + grid.ordinate(q, 0)));
          }
        }
        neighbours[row] = IntegerUtils.toArray(lst);
      }
    }
    return neighbours;
  }

  private Z compute(final int n, final int m) {
    if (mVerbose) {
      StringUtils.message("Permutation complexity " + n * m + "!");
    }
    final Permutation perm = new Permutation(n * m);
    final int[][] neighbours = buildNeighbours(n, m);
    long max = 0;
    int[] p;
    while ((p = perm.next()) != null) {
      max = Long.max(max, sum(neighbours, p));
    }
    return Z.valueOf(max);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return compute(mN, mM);
  }

  /**
   * Main to compute at a specific n and m
   * @param args n and m
   */
  public static void main(final String[] args) {
    final A384616 seq = new A384616();
    System.out.println(seq.compute(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}
