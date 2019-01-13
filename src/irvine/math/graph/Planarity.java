package irvine.math.graph;

import java.util.Arrays;

/**
 * A graph is planar if it can be drawn on a plane without crossing any edges. The
 * basic strategy in testing whether a graph G is planar involves finding a cycle C in
 * G. Then the graph G-C is decomposed into edge-disjoint paths. The paths are
 * added to cycle C one at a time while keeping the embedding planar. If the
 * embedding is successful then G is planar, otherwise G is non-planar.
 * Let n be the number of nodes and m be the number of edges in an undirected
 * graph. The following planar testing algorithm by Hopcroft and Tarjan takes O(n) operations.
 *
 * Step 1. If <code>m &gt; 3n-6</code>, then stop, the graph is non-planar.
 *
 * Step 2. Obtain a digraph D by a depth-first search on G so that the edges of G are
 * divided into tree edges and backward edges. During the depth-first
 * search compute the low point functions L1 and L2, where
 * L1(u) is the lowest node reachable from node u by a sequence of tree
 * edges followed by at most one backward edge, and
 * L2(u) is the second lowest node reachable from node u in this way.
 *
 * Step 3. Reorder the adjacency lists of D using a radix sort.
 *
 * Step 4. Use the low point functions computed from Step 2 and the ordering of
 * edges from Step 3 to choose a particular adjacency structure so that the
 * nodes of D are numbered in the order they are reached during any depth-
 * first search for D without changing the adjacency structure.
 *
 * Step 5. Prepare for the path addition process to be done in Step 6 by performing a
 * second depth-first search to select edges in the reverse order to that given
 * by the adjacency structure.
 *
 * Step 6. Perform a third depth-first search to generate one cycle and a number of
 * edge-disjoint paths. Each generated path is added to a planar embedding
 * that contains the cycle and all the previously generated paths. Note that
 * either any two paths may not constrain each other, or they may constrain
 * each other to have the same embedding or the opposite embedding.
 * These dependency relations among paths can be viewed as a dependency
 * graph H.
 *
 * Step 7. The dependency graph H is two-colorable if and only if the original graph
 * G is planar. Color the graph H by using a depth-first search. If H is two-
 * colorable then return the result that G is planar, otherwise return the
 * result that G is non-planar.
 *
 * @author Hang T. Lau
 * @author Sean A. Irvine (bug fixes, stylistic improvements)
 */
final class Planarity {

  Planarity() { }

  /**
   * Test if a graph is planar
   * @param graph graph to test
   * @return true iff the graph is planar
   */
  static boolean isPlanar(final Graph graph) {
    final Planarity planarity = new Planarity();
    for (final Graph biconnected : graph.biconnectedComponents()) {
      final int n = biconnected.order();
      if (n > 4) {
        final int edges = biconnected.size();
        final int[] nodei = new int[edges];
        final int[] nodej = new int[edges];
        for (int i = 1, k = 0; i < n; ++i) {
          int j = -1;
          while ((j = biconnected.nextVertex(i, j)) >= 0 && j < i) {
            nodei[k] = i + 1; // Lau numbers vertices from 1
            nodej[k] = j + 1;
            ++k;
          }
        }
        planarity.reset();
        if (!planarity.isPlanar(n, edges, nodei, nodej)) {
          return false;
        }
      }
    }
    return true;
  }

  // Lau uses numbering starting at 1 rather than 0 for both nodes and edges

  private int mLevel = 1;
  private int mInitP = 0;
  private int mSNode = 0;
  private int mPNum = 1;
  private int mSNum = 1;
  private int mNextE = 0;
  private int mStore1 = 0;
  private int mStore2 = 0;
  private int mStore3 = 0;
  private int mStore4 = 0;
  private int mStore5 = 0;
  private boolean mMiddle = false;
  private boolean mFail = false;

  /** Reset the tester. */
  void reset() {
    mLevel = 1;
    mInitP = 0;
    mSNode = 0;
    mPNum = 1;
    mSNum = 1;
    mNextE = 0;
    mStore1 = 0;
    mStore2 = 0;
    mStore3 = 0;
    mStore4 = 0;
    mStore5 = 0;
    mMiddle = false;
    mFail = false;
  }

  /**
   * Test if a biconnected graph is planar. Assume number of vertices is at least 5.
   * @param n number of nodes
   * @param m number of edges
   * @param nodeA first end node of each edge
   * @param nodeB second end node of each edge
   * @return true iff the graph is planar
   */
  boolean isPlanar(final int n, final int m, final int[] nodeA, final int[] nodeB) {
    // check for the necessary condition
    if (m > 3 * n - 6) {
      return false;
    }
    final int n2 = n + n;
    final int m2 = m + m;
    final int[] trail = new int[n + 1];
    final int[] descendant = new int[n + 1];
    final int[] firstLow = new int[n2 + 2]; // was n + 1
    final int[] secondLow = new int[n2 + 2]; // was n + 1
    final int[] nodebegin = new int[n2 + 1];
    final int[] wkpathfind5 = new int[m + 1];
    final int[] wkpathfind6 = new int[m + 1];
    final int[] stackArc = new int[m2 + 1];
    final int[] stackColor1 = new int[m2 + 3];
    final int[] stackColor2 = new int[m2 + 3];
    final int[] stackColor3 = new int[m2 + 3];
    final int[] stackColor4 = new int[m2 + 3];
    final int[] wkpathfind1 = new int[m2 + 3];
    final int[] wkpathfind2 = new int[m2 + 3];
    final int[] wkpathfind3 = new int[m + m + m + 4];
    final int[] wkpathfind4 = new int[m + m + m + 4];
    final int[] first = new int[n + m2 + 1];
    final int[] second = new int[n + m2 + 1];
    final int[] sortn = new int[n2 + m + 1];
    final int[] sortPtr1 = new int[n2 + m + 1];
    final int[] sortPtr2 = new int[n2 + m + 1];
    final int[] start = new int[m - n + 3];
    final int[] finish = new int[m - n + 3];
    final int[] paint = new int[m - n + 3];
    final int[] nextarc = new int[7 * m - 5 * n + 3];
    final int[] arctop = new int[7 * m - 5 * n + 3];
    final boolean[] examin = new boolean[m - n + 3];
    final boolean[] arctype = new boolean[7 * m - 5 * n + 3];
    final int nmp2 = m - n + 2;
    final int m7n5 = 7 * m - 5 * n + 2;
    // set up graph representation
    int mtotal = n;
    for (int i = 0; i < m; ++i) {
      final int node1 = nodeA[i];
      final int node2 = nodeB[i];
      ++mtotal;
      second[mtotal] = second[node1];
      second[node1] = mtotal;
      first[mtotal] = node2;
      ++mtotal;
      second[mtotal] = second[node2];
      second[node2] = mtotal;
      first[mtotal] = node1;
    }
    // initial depth-first search, compute low point functions
    Arrays.fill(firstLow, n + 1);
    Arrays.fill(secondLow, n + 1);
    final int[] mark = new int[n + 1];
    mark[1] = 1;
    wkpathfind5[1] = 1;
    do {
      planarityDFS1(mark, firstLow, secondLow, wkpathfind5, wkpathfind6, stackArc, first, second);
    } while (mLevel > 1);
    for (int i = 1; i <= n; ++i) {
      if (secondLow[i] >= mark[i]) {
        mtotal = n2;
      }
    }
    int k = n2;
    for (int i = 1; i <= n2; ++i) {
      sortn[i] = 0;
    }
    secondLow[n2 + 1] = firstLow[n2 + 1];
    for (int i = 2; i <= m2; i += 2) {
      ++k;
      sortPtr1[k] = stackArc[i - 1];
      final int tNode = stackArc[i];
      sortPtr2[k] = tNode;
      if (mark[tNode] < mark[sortPtr1[k]]) {
        final int j = 2 * mark[tNode] - 1;
        sortn[k] = sortn[j];
        sortn[j] = k;
      } else {
        if (secondLow[tNode] >= mark[sortPtr1[k]]) {
          final int j = 2 * firstLow[tNode] - 1;
          sortn[k] = sortn[j];
          sortn[j] = k;
        } else {
          final int j = 2 * firstLow[tNode];
          sortn[k] = sortn[j];
          sortn[j] = k;
        }
      }
    }
    for (int i = 1; i <= n2; ++i) {
      int j = sortn[i];
      while (j != 0) {
        final int node1 = sortPtr1[j];
        final int node2 = sortPtr2[j];
        ++mtotal;
        second[mtotal] = second[node1];
        second[node1] = mtotal;
        first[mtotal] = node2;
        j = sortn[j];
      }
    }
    // second depth-first search
    Arrays.fill(mark, 2, n + 1, 0);
    mStore1 = 0;
    mSNum = 1;
    trail[1] = 1;
    wkpathfind5[1] = 1;
    start[1] = 0;
    finish[1] = 0;
    mLevel = 1;
    mMiddle = false;
    do {
      planarityDFS2(mark, wkpathfind5, stackArc, first, second);
    } while (mLevel > 1);
    mtotal = n;
    for (int i = 1; i <= m; ++i) {
      final int j = i + i;
      final int node1 = stackArc[j - 1];
      final int node2 = stackArc[j];
      ++mtotal;
      second[mtotal] = second[node1];
      second[node1] = mtotal;
      first[mtotal] = node2;
    }
    // path decomposition, construction of the dependency graph
    wkpathfind1[1] = 0;
    wkpathfind1[2] = 0;
    wkpathfind2[1] = 0;
    wkpathfind2[2] = 0;
    wkpathfind3[1] = 0;
    wkpathfind3[2] = n + 1;
    wkpathfind3[3] = 0;
    wkpathfind4[1] = 0;
    wkpathfind4[2] = n + 1;
    wkpathfind4[3] = 0;
    for (int i = 1; i <= n2; ++i) {
      nodebegin[i] = 0;
    }
    mNextE = m - n + 1;
    for (int i = 1; i <= m7n5; ++i) {
      nextarc[i] = 0;
    }
    mSNode = n;
    descendant[1] = n;
    wkpathfind5[1] = 1;
    mLevel = 1;
    mMiddle = false;
    do {
      planarityDecompose(trail, descendant,
        nodebegin, wkpathfind5, start, finish, first, second, wkpathfind1,
        wkpathfind2, wkpathfind3, wkpathfind4, nextarc, arctop, arctype);
    } while (mLevel > 1);
    // perform two-coloring
    --mPNum;
    for (int i = 1; i <= nmp2; ++i) {
      paint[i] = 0;
    }
    final int j = mPNum + 1;
    for (int i = 2; i <= j; ++i) {
      examin[i] = true;
    }
    int tnum = 1;
    while (tnum <= mPNum) {
      wkpathfind5[1] = tnum;
      paint[tnum] = 1;
      examin[tnum] = false;
      mLevel = 1;
      mMiddle = false;
      do {
        planarityTwoColoring(wkpathfind5, paint, nextarc, arctop, examin, arctype);
        if (mFail) {
          return false;
        }
      } while (mLevel > 1);
      while (!examin[tnum]) {
        ++tnum;
      }
    }
    int aux1 = 0;
    int aux2 = 0;
    int aux3 = 0;
    int aux4 = 0;
    stackColor1[1] = 0;
    stackColor1[2] = 0;
    stackColor2[1] = 0;
    stackColor2[2] = 0;
    stackColor3[1] = 0;
    stackColor3[2] = 0;
    stackColor4[1] = 0;
    stackColor4[2] = 0;
    for (int i = 1; i <= mPNum; ++i) {
      final int qNode = start[i + 1];
      final int tNode = finish[i + 1];
      while (qNode <= stackColor1[aux1 + 2]) {
        aux1 -= 2;
      }
      while (qNode <= stackColor2[aux2 + 2]) {
        aux2 -= 2;
      }
      while (qNode <= stackColor3[aux3 + 2]) {
        aux3 -= 2;
      }
      while (qNode <= stackColor4[aux4 + 2]) {
        aux4 -= 2;
      }
      if (paint[i] == 1) {
        if (finish[trail[qNode] + 1] != tNode) {
          if (tNode < stackColor2[aux2 + 2]) {
            return false;
          }
          if (tNode < stackColor3[aux3 + 2]) {
            return false;
          }
          aux3 += 2;
          stackColor3[aux3 + 1] = i;
          stackColor3[aux3 + 2] = tNode;
        } else {
          if ((tNode < stackColor3[aux3 + 2]) && (start[stackColor3[aux3 + 1] + 1] <= descendant[qNode])) {
            return false;
          }
          aux1 += 2;
          stackColor1[aux1 + 1] = i;
          stackColor1[aux1 + 2] = qNode;
        }
      } else {
        if (finish[trail[qNode] + 1] != tNode) {
          if (tNode < stackColor1[aux1 + 2]) {
            return false;
          }
          if (tNode < stackColor4[aux4 + 2]) {
            return false;
          }
          aux4 += 2;
          stackColor4[aux4 + 1] = i;
          stackColor4[aux4 + 2] = tNode;
        } else {
          if ((tNode < stackColor4[aux4 + 2]) && (start[stackColor4[aux4 + 1] + 1] <= descendant[qNode])) {
            return false;
          }
          aux2 += 2;
          stackColor2[aux2 + 1] = i;
          stackColor2[aux2 + 2] = qNode;
        }
      }
    }
    return true;
  }

  private void planarityDFS1(final int[] mark, final int[] firstLow, final int[] secondLow, final int[] wkpathfind5, final int[] wkpathfind6,
                             final int[] stackArc, final int[] first, final int[] second) {
    int pNode = 0;
    int qNode = 0;
    int tNode = 0;
    boolean skip = mMiddle;
    if (!skip) {
      qNode = wkpathfind5[mLevel];
      pNode = wkpathfind6[mLevel];
    }
    while (second[qNode] > 0 || skip) {
      if (!skip) {
        tNode = first[second[qNode]];
        second[qNode] = second[second[qNode]];
      }
      if ((mark[tNode] < mark[qNode] && tNode != pNode) || skip) {
        if (!skip) {
          mStore1 += 2;
          stackArc[mStore1 - 1] = qNode;
          stackArc[mStore1] = tNode;
        }
        if (mark[tNode] == 0 || skip) {
          if (!skip) {
            mark[tNode] = ++mSNum;
            wkpathfind5[++mLevel] = tNode;
            wkpathfind6[mLevel] = qNode;
            mMiddle = false;
            return;
          }
          skip = false;
          tNode = wkpathfind5[mLevel];
          qNode = wkpathfind6[mLevel];
          pNode = wkpathfind6[--mLevel];
          if (firstLow[tNode] < firstLow[qNode]) {
            final int tmp1 = secondLow[tNode];
            final int tmp2 = firstLow[qNode];
            secondLow[qNode] = tmp1 < tmp2 ? tmp1 : tmp2;
            firstLow[qNode] = firstLow[tNode];
          } else {
            if (firstLow[tNode] == firstLow[qNode]) {
              final int tmp1 = secondLow[tNode];
              final int tmp2 = secondLow[qNode];
              secondLow[qNode] = tmp1 < tmp2 ? tmp1 : tmp2;
            } else {
              final int tmp1 = firstLow[tNode];
              final int tmp2 = secondLow[qNode];
              secondLow[qNode] = tmp1 < tmp2 ? tmp1 : tmp2;
            }
          }
        } else {
          if (mark[tNode] < firstLow[qNode]) {
            secondLow[qNode] = firstLow[qNode];
            firstLow[qNode] = mark[tNode];
          } else if (mark[tNode] > firstLow[qNode]) {
              final int tmp1 = mark[tNode];
              final int tmp2 = secondLow[qNode];
              secondLow[qNode] = tmp1 < tmp2 ? tmp1 : tmp2;
          }
        }
      }
    }
    mMiddle = true;
  }

  private void planarityDFS2(final int[] mark, final int[] wkpathfind5, final int[] stackArc, final int[] first, final int[] second) {
    final int qNode;
    if (mMiddle) {
      final int tnode = wkpathfind5[mLevel];
      qNode = wkpathfind5[--mLevel];
      mStore1 += 2;
      stackArc[mStore1 - 1] = mark[qNode];
      stackArc[mStore1] = mark[tnode];
    } else {
      qNode = wkpathfind5[mLevel];
    }
    while (second[qNode] > 0) {
      final int tNode = first[second[qNode]];
      second[qNode] = second[second[qNode]];
      if (mark[tNode] == 0) {
        mark[tNode] = ++mSNum;
        wkpathfind5[++mLevel] = tNode;
        mMiddle = false;
        return;
      }
      mStore1 += 2;
      stackArc[mStore1 - 1] = mark[qNode];
      stackArc[mStore1] = mark[tNode];
    }
    mMiddle = true;
  }

  private void planarityDecompose(final int[] trail, final int[] descendant, final int[] nodeBegin, final int[] wkpathfind5, final int[] start,
                                  final int[] finish, final int[] first, final int[] second, final int[] wkpathfind1,
                                  final int[] wkpathfind2, final int[] wkpathfind3, final int[] wkpathfind4, final int[] nextArc,
                                  final int[] arcTop, final boolean[] arcType) {
    int qNode = 0;
    int tNode = 0;
    boolean skip = mMiddle;
    if (!skip) {
      qNode = wkpathfind5[mLevel];
    }
    while ((second[qNode] != 0) || skip) {
      if (!skip) {
        tNode = first[second[qNode]];
        second[qNode] = second[second[qNode]];
        if (mInitP == 0) {
          mInitP = qNode;
        }
      }
      if ((tNode > qNode) || skip) {
        if (!skip) {
          descendant[tNode] = mSNode;
          trail[tNode] = mPNum;
          wkpathfind5[++mLevel] = tNode;
          mMiddle = false;
          return;
        }
        skip = false;
        tNode = wkpathfind5[mLevel];
        qNode = wkpathfind5[--mLevel];
        mSNode = tNode - 1;
        mInitP = 0;
        while (qNode <= wkpathfind2[mStore3 + 2]) {
          mStore3 -= 2;
        }
        while (qNode <= wkpathfind1[mStore2 + 2]) {
          mStore2 -= 2;
        }
        while (qNode <= wkpathfind3[mStore4 + 3]) {
          mStore4 -= 3;
        }
        while (qNode <= wkpathfind4[mStore5 + 3]) {
          mStore5 -= 3;
        }
        boolean ind = false;
        final int qnode2 = qNode + qNode;
        while ((nodeBegin[qnode2 - 1] > wkpathfind3[mStore4 + 2]) && (qNode < wkpathfind3[mStore4 + 2]) && (nodeBegin[qnode2] < wkpathfind3[mStore4 + 1])) {
          ind = true;
          int node1 = nodeBegin[qnode2];
          int node2 = wkpathfind3[mStore4 + 1];
          nextArc[++mNextE] = nextArc[node1];
          nextArc[node1] = mNextE;
          arcTop[mNextE] = node2;
          node1 = wkpathfind3[mStore4 + 1];
          node2 = nodeBegin[qnode2];
          nextArc[++mNextE] = nextArc[node1];
          nextArc[node1] = mNextE;
          arcTop[mNextE] = node2;
          arcType[mNextE - 1] = false;
          arcType[mNextE] = false;
          mStore4 -= 3;
        }
        if (ind) {
          mStore4 += 3;
        }
        nodeBegin[qnode2 - 1] = 0;
        nodeBegin[qnode2] = 0;
      } else {
        start[mPNum + 1] = mInitP;
        finish[mPNum + 1] = tNode;
        boolean ind = false;
        if (wkpathfind1[mStore2 + 2] != 0) {
          mStore3 += 2;
          wkpathfind2[mStore3 + 1] = wkpathfind1[mStore2 + 1];
          wkpathfind2[mStore3 + 2] = wkpathfind1[mStore2 + 2];
        }
        if (finish[wkpathfind1[mStore2 + 1] + 1] != tNode) {
          while (tNode < wkpathfind2[mStore3 + 2]) {
            int node1 = mPNum;
            int node2 = wkpathfind2[mStore3 + 1];
            nextArc[++mNextE] = nextArc[node1];
            nextArc[node1] = mNextE;
            arcTop[mNextE] = node2;
            node1 = wkpathfind2[mStore3 + 1];
            node2 = mPNum;
            nextArc[++mNextE] = nextArc[node1];
            nextArc[node1] = mNextE;
            arcTop[mNextE] = node2;
            arcType[mNextE - 1] = true;
            arcType[mNextE] = true;
            ind = true;
            mStore3 -= 2;
          }
          if (ind) {
            mStore3 += 2;
          }
          // ind = false;
          while (tNode < wkpathfind3[mStore4 + 3] && mInitP < wkpathfind3[mStore4 + 2]) {
            int node1 = mPNum;
            int node2 = wkpathfind3[mStore4 + 1];
            nextArc[++mNextE] = nextArc[node1];
            nextArc[node1] = mNextE;
            arcTop[mNextE] = node2;
            node1 = wkpathfind3[mStore4 + 1];
            node2 = mPNum;
            nextArc[++mNextE] = nextArc[node1];
            nextArc[node1] = mNextE;
            arcTop[mNextE] = node2;
            arcType[mNextE - 1] = false;
            arcType[mNextE] = false;
            mStore4 -= 3;
          }
          while (tNode < wkpathfind4[mStore5 + 3] && mInitP < wkpathfind4[mStore5 + 2]) {
            mStore5 -= 3;
          }
          final int tnode2 = tNode + tNode;
          if (mInitP > nodeBegin[tnode2 - 1]) {
            nodeBegin[tnode2 - 1] = mInitP;
            nodeBegin[tnode2] = mPNum;
          }
          mStore4 += 3;
          wkpathfind3[mStore4 + 1] = mPNum;
          wkpathfind3[mStore4 + 2] = mInitP;
          wkpathfind3[mStore4 + 3] = tNode;
          mStore5 += 3;
          wkpathfind4[mStore5 + 1] = mPNum;
          wkpathfind4[mStore5 + 2] = mInitP;
          wkpathfind4[mStore5 + 3] = tNode;
        } else {
          while ((tNode < wkpathfind4[mStore5 + 3]) && (mInitP < wkpathfind4[mStore5 + 2]) && (wkpathfind4[mStore5 + 2] <= descendant[mInitP])) {
            ind = true;
            int node1 = mPNum;
            int node2 = wkpathfind4[mStore5 + 1];
            nextArc[++mNextE] = nextArc[node1];
            nextArc[node1] = mNextE;
            arcTop[mNextE] = node2;
            node1 = wkpathfind4[mStore5 + 1];
            node2 = mPNum;
            nextArc[++mNextE] = nextArc[node1];
            nextArc[node1] = mNextE;
            arcTop[mNextE] = node2;
            arcType[mNextE - 1] = false;
            arcType[mNextE] = false;
            mStore5 -= 3;
          }
          if (ind) {
            mStore5 += 3;
          }
        }
        if (qNode != mInitP) {
          mStore2 += 2;
          wkpathfind1[mStore2 + 1] = mPNum;
          wkpathfind1[mStore2 + 2] = mInitP;
        }
        ++mPNum;
        mInitP = 0;
      }
    }
    mMiddle = true;
  }

  private void planarityTwoColoring(final int[] wkpathfind5, final int[] paint,
                                    final int[] nextArc, final int[] arcTop, final boolean[] examin, final boolean[] arcType) {
    mFail = false;
    final int qnode = mMiddle ? wkpathfind5[--mLevel] : wkpathfind5[mLevel];
    while (nextArc[qnode] != 0) {
      final int link = nextArc[qnode];
      final int tnode = arcTop[link];
      nextArc[qnode] = nextArc[link];
      if (paint[tnode] == 0) {
        paint[tnode] = arcType[link] ? paint[qnode] : 3 - paint[qnode];
      } else {
        final boolean dum1 = paint[tnode] == paint[qnode];
        final boolean dum2 = !arcType[link];
        if ((dum1 && dum2) || (!dum1 && !dum2)) {
          mFail = true;
          return;
        }
      }
      if (examin[tnode]) {
        examin[tnode] = false;
        wkpathfind5[++mLevel] = tnode;
        mMiddle = false;
        return;
      }
    }
    mMiddle = true;
  }

}
