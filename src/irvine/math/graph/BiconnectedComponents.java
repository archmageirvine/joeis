package irvine.math.graph;

import irvine.util.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

/**
 * Compute the biconnected components of a graph.
 * @author Sean A. Irvine
 */
final class BiconnectedComponents {

  private static final int NIL = -1;

  private int mCount = 0;
  private final Graph mGraph;
  private final boolean[] mVisited;
  private final int[] mParent;
  private final int[] mD;
  private final int[] mLow;
  private final int[] mA;
  private final int[] mB;
  private final int[] mRelabel;
  private final Stack<Point> mStack = new Stack<>();
  private final Collection<Graph> mBicomponents = new ArrayList<>();

  private BiconnectedComponents(final Graph graph) {
    mGraph = graph;
    final int n = graph.order();
    mVisited = new boolean[n];
    mParent = new int[n];
    mD = new int[n];
    mLow = new int[n];
    final int maxEdges = n * (n - 1) / 2;
    mA = new int[maxEdges];
    mB = new int[maxEdges];
    mRelabel = new int[n];
    Arrays.fill(mParent, NIL);
    for (int u = 0; u < n; ++u) {
      if (!mVisited[u]) {
        depthFirstSearch(u);
      }
    }
  }

  private void depthFirstSearch(final int u) {
    mVisited[u] = true;
    mD[u] = ++mCount;
    mLow[u] = mD[u];
    int v = -1;
    while ((v = mGraph.nextVertex(u, v)) != NIL) {
      if (!mVisited[v]) {
        mStack.push(new Point(u, v));
        mParent[v] = u;
        depthFirstSearch(v);
        if (mLow[v] >= mD[u]) {
          foundComponent(u, v);
        }
        mLow[u] = Math.min(mLow[u], mLow[v]);
      } else if (mParent[u] != v && mD[v] < mD[u]) {
        // (u,v) is a back edge from u to its ancestor v
        mStack.push(new Point(u, v));
        mLow[u] = Math.min(mLow[u], mD[v]);
      }
    }
  }

  private void foundComponent(final int u, final int v) {
    Point edge;
    int k = 0;
    int label = 0;
    Arrays.fill(mRelabel, NIL);
    do {
      edge = mStack.pop();
      final int left = edge.left();
      if (mRelabel[left] == NIL) {
        mRelabel[left] = label++;
      }
      final int right = edge.right();
      if (mRelabel[right] == NIL) {
        mRelabel[right] = label++;
      }
      mA[k] = mRelabel[left];
      mB[k] = mRelabel[right];
      ++k;
    } while (edge.left() != u || edge.right() != v);
    final Graph bicomponent = GraphFactory.create(label);
    while (--k >= 0) {
      bicomponent.addEdge(mA[k], mB[k]);
    }
    mBicomponents.add(bicomponent);
  }


  public static Collection<Graph> biconnectedComponents(final Graph graph) {
    return new BiconnectedComponents(graph).mBicomponents;
  }

}

