package irvine.oeis.a018;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018940.
 * @author Sean A. Irvine
 */
public class A018940 implements Sequence {

  // We are given the quotient graph, which you can think of as the repeating unit.
  // We then have to find cycles in the full graph.  This is done with a depth first
  // search.  To speed up the search, we also maintain the shortest distance of
  // each node from the origin.  That way, if it would be impossible to close the
  // cycle in the remaining steps, then the search can be abandoned.

  // We also need a way of describing the position with the lattice.  Can think
  // of this as a quadruple (a,b,c,d) where "a" is the node in the quotient graph
  // and b, c, d, track the specific instance of that node.  To make the
  // computation faster (a,b,c,d) is squeezed into an "int" with 2 bits for a,
  // and 7 bits each for b, c, d (in that order).  Finally, the origin is selected
  // to be in the middle of this representation, so that we do not need to worry
  // about negative numbers.  Taken together this means we can in theory generate
  // up to 64 terms of the sequence, but we would get sick of waiting long before
  // then.

  private static final int BITS_PER_COORD = 7;

  private int mN = 2;
  private long mCount = 0;
  private final int mBitsPerNode;
  private final int mC;
  private final int mD;
  private final int mNodeMask;
  private final int mOrigin;

  // Minimum distance from origin + 1 (uses 0 as sentinel)
  private final byte[] mDistance;
  private int mDistanceDone = 0;
  // Keep track of nodes on current path in depth first search
  private final boolean[] mVisited;
  // Stores the delta to step from one node to next for each neighbour of a node
  private final int[][] mQuotientDelta;

  /** Construct the sequence. */
  public A018940() {
    final int[][][] graph = topolanNeighbourhoodToQuotientGraph(getNeighbourhoodDescription());
    mBitsPerNode = IntegerUtils.lg(graph.length - 1);
    final int b = mBitsPerNode + 3 * BITS_PER_COORD;
    mC = mBitsPerNode + 2 * BITS_PER_COORD;
    mD = mBitsPerNode + BITS_PER_COORD;
    mNodeMask = (1 << mBitsPerNode) - 1;
    mOrigin = mNodeToIndex.get(startNode()) + (1 << (b - 1)) + (1 << (mC - 1)) + (1 << (mD - 1));
    mDistance = new byte[2 * mOrigin];
    mDistance[mOrigin] = 1;
    mVisited = new boolean[2 * mOrigin];
    mQuotientDelta = quotientToLongDeltas(graph);
  }

  private static int getNodeId(final HashMap<String, Integer> nodeToIndex, final ArrayList<ArrayList<int[]>> q, final String node) {
    if (!nodeToIndex.containsKey(node)) {
      nodeToIndex.put(node, nodeToIndex.size());
      q.add(new ArrayList<>());
    }
    return nodeToIndex.get(node);
  }

  private static int dir(final char c) {
    switch (c) {
      case '+':
        return 1;
      case '-':
        return -1;
      default:
        return 0;
    }
  }

  private final HashMap<String, Integer> mNodeToIndex = new HashMap<>();

  private int[][][] topolanNeighbourhoodToQuotientGraph(final String topolan) {
    final ArrayList<ArrayList<int[]>> q = new ArrayList<>();
    for (final String line : topolan.replace(":", "").split("\n")) {
      if (!line.isEmpty()) {
        final String[] p = line.split("\\s+");
        final String node = p[0];
        final int id = getNodeId(mNodeToIndex, q, node);
        for (int k = 1; k < p.length; ++k) {
          final String n = p[k];
          final int open = n.indexOf('(');
          final int nid = getNodeId(mNodeToIndex, q, n.substring(0, open));
          final int[] forward = new int[4];
          forward[0] = nid - id;
          forward[1] = dir(n.charAt(open + 1));
          forward[2] = dir(n.charAt(open + 2));
          forward[3] = dir(n.charAt(open + 3));
          final int[] reverse = new int[4];
          for (int j = 0; j < reverse.length; ++j) {
            reverse[j] = -forward[j];
          }
          q.get(id).add(forward);
          q.get(nid).add(reverse);
        }
      }
    }
    final int[][][] quotientGraph = new int[q.size()][][];
    for (int k = 0; k < quotientGraph.length; ++k) {
      quotientGraph[k] = new int[q.get(k).size()][];
      for (int j = 0; j < q.get(k).size(); ++j) {
        quotientGraph[k][j] = q.get(k).get(j);
      }
    }
    return quotientGraph;
  }

  protected String getNeighbourhoodDescription() {
    // ABW
    return "a-1: a-4(000) a-3(+0+) a-3(000) a-2(0+0)\n"
      + "a-2: a-4(+0+) a-4(000) a-3(0-+)\n"
      + "a-3: a-4(0+0)\n";
  }

  protected String startNode() {
    return "a-1";
  }

  // Convert to packed representation -- happens once during initialization
  private int[][] quotientToLongDeltas(final int[][][] graph) {
    final int vertices = graph.length;
    final int[][] delta = new int[vertices][];
    for (int v = 0; v < vertices; ++v) {
      final int neighbours = graph[v].length;
      delta[v] = new int[neighbours];
      for (int k = 0; k < neighbours; ++k) {
        final int[] s = graph[v][k];
        delta[v][k] = s[0] + (s[1] << mC) + (s[2] << mD) + (s[3] << mBitsPerNode);
      }
    }
    return delta;
  }

  // Ensure the minimum distance cache goes out to distance n
  private void stepDistance(final int n) {
    while (mDistanceDone <= n) {
      ++mDistanceDone;
      final byte d = (byte) (mDistanceDone + 1);
      for (int k = 0; k < mDistance.length; ++k) {
        if (mDistance[k] == mDistanceDone) {
          for (final int delta : mQuotientDelta[k & mNodeMask]) {
            final int j = k + delta;
            if (j >= 0 && j < mDistance.length && mDistance[j] == 0) {
              mDistance[j] = d;
            }
          }
        }
      }
    }
  }

  private void search(final int point, final int n) {
    if (n == mN) {
      if (point == mOrigin) {
        ++mCount;
      }
      return;
    }
    if (point < 0 || point >= mDistance.length) {
      return;
    }

    final byte dist = mDistance[point];
    assert dist != 0;
    if (dist - 1 > mN - n) {
      return; // can never make it back to origin in time
    }

    if (!mVisited[point]) {
      mVisited[point] = true;
      for (final int delta : mQuotientDelta[point & mNodeMask]) {
        search(point + delta, n + 1);
      }
      mVisited[point] = false;
    }
  }

  @Override
  public Z next() {
    mN += 2; // AWB always even cycle length
    if (mN >= 64) {
      throw new UnsupportedOperationException(); // exceeds implementation limits
    }
    stepDistance(mN);
    mCount = 0;
    search(mOrigin, 0);
    return Z.valueOf(mCount / 2); // halve count, two directions around each cycle
  }
}

