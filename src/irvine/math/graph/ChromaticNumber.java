package irvine.math.graph;

import java.util.Arrays;

/**
 * Compute chromatic numbers. Brute force back-tracking.
 * @author Sean A. Irvine
 */
final class ChromaticNumber {

  private final Graph mGraph;
  private int mBest;

  private final int[] mColor;

  ChromaticNumber(final Graph graph) {
    mGraph = graph;
    mColor = new int[graph.order()];
    Arrays.fill(mColor, -1);
  }

  private int selectVertex() {
    int best = -1;
    int bestSat = -1;
    long bestDeg = -1;

    for (int v = 0; v < mColor.length; ++v) {
      if (mColor[v] == -1) {
        final boolean[] used = new boolean[mColor.length];
        int sat = 0;
        for (int u = mGraph.nextVertex(v, -1); u >= 0; u = mGraph.nextVertex(v, u)) {
          final int c = mColor[u];
          if (c >= 0 && !used[c]) {
            used[c] = true;
            ++sat;
          }
        }
        if (sat > bestSat || (sat == bestSat && mGraph.degree(v) > bestDeg)) {
          best = v;
          bestSat = sat;
          bestDeg = mGraph.degree(v);
        }
      }
    }
    return best;
  }

  private void search(final int usedColors) {
    if (usedColors >= mBest) {
      return; // prune
    }
    final int v = selectVertex();
    if (v == -1) {
      // all colored
      mBest = usedColors;
      return;
    }
    final boolean[] forbidden = new boolean[mBest];
    for (int u = mGraph.nextVertex(v, -1); u >= 0; u = mGraph.nextVertex(v, u)) {
      final int c = mColor[u];
      if (c >= 0) {
        forbidden[c] = true;
      }
    }
    // try existing colors
    for (int c = 0; c < usedColors; ++c) {
      if (!forbidden[c]) {
        mColor[v] = c;
        search(usedColors);
        mColor[v] = -1;
      }
    }
    // try new color
    mColor[v] = usedColors;
    search(usedColors + 1);
    mColor[v] = -1;
  }

  int chromaticNumber() {
    final int n = mGraph.order();
    // trivial upper bound
    mBest = n;
    // better initial upper bound: greedy coloring
    for (int v = 0; v < n; ++v) {
      final boolean[] used = new boolean[n];
      for (int u = mGraph.nextVertex(v, -1); u >= 0; u = mGraph.nextVertex(v, u)) {
        if (mColor[u] >= 0) {
          used[mColor[u]] = true;
        }
      }
      int c = 0;
      while (used[c]) {
        ++c;
      }
      mColor[v] = c;
      if (c + 1 > mBest) {
        mBest = c + 1;
      }
    }
    // reset
    for (int i = 0; i < n; ++i) {
      mColor[i] = -1;
    }
    search(0);
    return mBest;
  }
}
