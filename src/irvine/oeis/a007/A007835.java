package irvine.oeis.a007;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A007835 Number of unordered sets of pairs <code>(in-degree, out-degree)</code> for nodes of directed trees on n unlabeled nodes (the edges are directed in arbitrary directions, the tree is <code>unrooted)</code>.
 * @author Sean A. Irvine
 */
public class A007835 implements Sequence, GraphProcessor {

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
      inOut.sort((a, b) -> {
        final int c = a.left().compareTo(b.left());
        if (c != 0) {
          return c;
        }
        return a.right().compareTo(b.right());
      });
      mAccepted.add(inOut);
    }
  }

  @Override
  public void process(final Graph graph) throws IOException {
    ++mGenCount;
    // Convert to directed tree in all possible ways
    mDigraph.direct(graph, 0, graph.size(), graph.size(), true, graph.order());
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
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount + " directed " + mDirected);
      System.out.println(mAccepted);
    }
    return Z.valueOf(mAccepted.size());
  }
}
