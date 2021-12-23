package irvine.oeis.a053;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.transform.EulerTransformSequence;

/**
 * A053418 Number of unlabeled directed graphs with n arcs and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A053418 extends EulerTransformSequence {

  // Very slow ...

  private static class A053418Inner implements Sequence, GraphProcessor {
    private DigraphCheck mDigraph = null;
    private final long[] mEdgeCounts = new long[1000];
    protected int mN = 1;

    private class DigraphCheck extends DirectedGraph {
      @Override
      protected void process(final Graph g) {
        ++mEdgeCounts[g.size()];
      }
    }

    @Override
    public void process(final Graph graph) throws IOException {
      mDigraph.direct(graph, 0, graph.size(), Integer.MAX_VALUE, false);
    }

    @Override
    public Z next() {
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setConnectionLevel(1);
      gg.setVertices(++mN);
      gg.setMaxEdges((mN * mN - mN) / 2);
      gg.sanitizeParams();
      gg.setProcessor(this);
      mDigraph = new DigraphCheck();
      try {
        gg.run(false, false, false, 0, 0);
      } catch (final IOException e) {
        throw new RuntimeException(e); // We are not generating output anyway
      }
      //System.out.println(Arrays.toString(mEdgeCounts));
      return Z.valueOf(mEdgeCounts[mN - 1]);
    }
  }

  /** Construct the sequence. */
  public A053418() {
    super(new A053418Inner(), 0);
  }
}
