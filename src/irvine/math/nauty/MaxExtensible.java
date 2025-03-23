package irvine.math.nauty;

import java.util.ArrayList;
import java.util.List;

/**
 * Maximum edges for a particular kind of graph.
 * @author Sean A. Irvine
 */
class MaxExtensible implements MaxEdges {

  private final List<Integer> mMaxEdges = new ArrayList<>();

  protected MaxExtensible(final int... values) {
    for (final int v : values) {
      mMaxEdges.add(v);
    }
  }

  @Override
  public int getMaxEdges(final int vertices) {
    while (vertices >= mMaxEdges.size()) {
      final int n = mMaxEdges.size();
      final int e = mMaxEdges.get(n - 1);
      mMaxEdges.add(e + 2 * e / (n - 2));
    }
    return mMaxEdges.get(vertices);
  }
}
