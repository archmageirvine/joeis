package irvine.oeis.a028;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028446 Number of perfect matchings in graph P_{2n} X P_{2n} X P_{2n}.
 * @author Sean A. Irvine
 */
public class A028446 implements Sequence {

  // This is only capable of getting 3 terms and a(3) takes a fair amount of time.

  private int mN = -2;
  private long mCount = 0;
  private long mMaximal = 0;

  private void countMaximalIndependentEdgeSets(final Graph g, final long usedVertices, final int u, final int v) {
    if (usedVertices == mMaximal) {
      ++mCount;
      return;
    }
    if (u < g.order()) {
      if ((usedVertices & (1L << u)) != 0) {
        countMaximalIndependentEdgeSets(g, usedVertices, u + 1, u + 1);
      } else {
        final int w = g.nextVertex(u, v);
        if (w >= 0) {
          if ((usedVertices & (1L << w)) == 0) {
            countMaximalIndependentEdgeSets(g, usedVertices | (1L << u) | (1L << w), u, w);
          }
          countMaximalIndependentEdgeSets(g, usedVertices, u, w);
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    final Graph g = GraphFactory.pathPowerGraph(mN, 3);
    if (g.order() > 64) {
      throw new UnsupportedOperationException(); // we'll never get this far anyway
    }
    mMaximal = Z.ONE.shiftLeft(g.order()).subtract(1).longValue(); //1L << g.order()) - 1;
    countMaximalIndependentEdgeSets(g, 0L, 0, 0);
    return Z.valueOf(mCount);
  }
}
