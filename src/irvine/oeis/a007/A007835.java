package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.ToLongFunction;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A007835 Number of unordered sets of pairs (in-degree, out-degree) for nodes of directed trees on n unlabeled nodes (the edges are directed in arbitrary directions, the tree is unrooted).
 * @author Sean A. Irvine
 */
public class A007835 extends Sequence1 implements GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private DigraphCheck mDigraph = null;
  private final HashSet<List<Pair<Long, Long>>> mAccepted = new HashSet<>();
  private long mGenCount = 0;
  private long mDirected = 0;
  private int mN = 0;

  private final class DigraphCheck extends DirectedGraph {
    @Override
    protected void process(final Graph g) {
      ++mDirected;
      final int n = g.order();
      final ArrayList<Pair<Long, Long>> inOut = new ArrayList<>(n);
      for (int v = 0; v < n; ++v) {
        inOut.add(new Pair<>(g.inDegree(v), g.degree(v)));
      }
      inOut.sort(Comparator.comparingLong((ToLongFunction<Pair<Long, Long>>) Pair::left).thenComparingLong(Pair::right));
      mAccepted.add(inOut);
    }
  }

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    // Convert to directed tree in all possible ways
    mDigraph.direct(graph, 0, graph.size(), graph.size(), true, false);
  }

  @Override
  public Z next() {
    ++mN;
    // Generate trees
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mDigraph = new DigraphCheck();
    mGenCount = 0;
    mDirected = 0;
    mAccepted.clear();
    gg.run(false, false, false, 0, 0);
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount + " directed " + mDirected);
      System.out.println(mAccepted);
    }
    return Z.valueOf(mAccepted.size());
  }
}
