package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.LongOrderedPair;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A061289 Consider a network of triangles consisting of an equilateral triangle divided into n^2 equilateral triangles plus a circle connecting the vertices of the main triangle. Sequence gives minimal number of corner turns required to trace the network in one continuous line.
 * @author Sean A. Irvine
 */
public class A061289 extends Sequence1 {

  private static final Lattice L = Lattices.HEXAGONAL;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Map<Long, List<Long>> mNeighbours = null;
  private int mEdgeCount = 0;
  private int mN = 0;
  private int mBest = 0;

  private Set<Long> buildTriangles(final int n) {
    final HashSet<Long> pts = new HashSet<>();
    for (int row = 0; row <= n; ++row) {
      for (int col = 0, x = -row; col <= row; ++col, x += 2) {
        pts.add(L.toPoint(x, row));
      }
    }
    return pts;
  }

  private Set<LongOrderedPair> buildEdges(final Map<Long, List<Long>> neighbours) {
    final HashSet<LongOrderedPair> edges = new HashSet<>();
    for (final Map.Entry<Long, List<Long>> e : neighbours.entrySet()) {
      for (final long q : e.getValue()) {
        edges.add(new LongOrderedPair(e.getKey(), q));
      }
    }
    return edges;
  }

  private Map<Long, List<Long>> buildNeighbours(final Set<Long> pts) {
    final Map<Long, List<Long>> neighbours = new HashMap<>();
    for (final long p : pts) {
      final ArrayList<Long> n = new ArrayList<>();
      for (final long q : L.neighbours(p)) {
        if (pts.contains(q)) {
          n.add(q);
        }
      }
      neighbours.put(p, n);
    }
    return neighbours;
  }

  private void search(final Set<LongOrderedPair> used, final long p, final long delta, final int turns) {
    if (turns >= mBest) {
      return; // No better than what is already known
    }
    if (used.size() == mEdgeCount) {
      if (p == L.origin()) {
        mBest = turns;
        if (mVerbose) {
          StringUtils.message("New best is " + mBest);
        }
      }
      return;
    }
    for (final long q : mNeighbours.get(p)) {
      final LongOrderedPair e = new LongOrderedPair(p, q);
      final long d = q - p;
      final Set<LongOrderedPair> u = new HashSet<>(used);
      if (u.add(e)) { // Avoid any repeated work (heuristic)
        search(u, q, d, d == delta ? turns : turns + 1);
      }
    }
  }

  @Override
  public Z next() {
    final Set<Long> pts = buildTriangles(++mN);
    mNeighbours = buildNeighbours(pts);
    mEdgeCount = buildEdges(mNeighbours).size();
    mBest = mEdgeCount;
    final long p = mNeighbours.get(L.origin()).get(0); // Break initial symmetry
    final HashSet<LongOrderedPair> seen = new HashSet<>();
    seen.add(new LongOrderedPair(p, L.origin()));
    search(seen, p, p - L.origin(), 1);
    return Z.valueOf(mBest);
  }

}
