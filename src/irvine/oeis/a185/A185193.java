package irvine.oeis.a185;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A185193 Number of unlabeled digraphs on n vertices such that every vertex has outdegree 3.
 * @author Sean A. Irvine
 */
public class A185193 extends Sequence1 implements GraphProcessor {

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    @Override
    protected void process(final Graph g) {
      for (int u = 0; u < g.order(); ++u) {
        if (g.degree(u) != 3) {
          return;
        }
      }
      ++mCount;
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private DigraphCheck mDigraph = null;
  private long mGenCount = 0;

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    final int n = graph.order();
    mDigraph.direct(graph, 0, 3 * n, 3 * n, false, false);
  }


  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(++mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(3 * mN);
    gg.setConnectionLevel(1);
    gg.setMinDeg(3);
    gg.setMaxDeg(6);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mDigraph = new DigraphCheck();
    mGenCount = 0;
    gg.run(0, 0, 0);
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mDigraph.mCount);
  }
}
