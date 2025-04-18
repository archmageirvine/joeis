package irvine.oeis.a006;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006856 Maximal number of edges in n-node graph of girth at least 5.
 * @author Sean A. Irvine
 */
public class A006856 extends Sequence1 implements GraphProcessor {

  // This is not competitive

  private int mN = 0;

  @Override
  public void process(final Graph graph) {
    // If we see a single graph then we have found the answer.
    // We need to abort the computation, so do it this ugly way.
    throw new RuntimeException("found");
  }

  @Override
  public Z next() {
    ++mN;
    int edges = (int) ((mN / 4.0) * (1 + Math.sqrt(4 * mN - 3))); // upper bound
    while (true) {
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setConnectionLevel(1);
      gg.setVertices(mN);
      gg.setMinEdges(edges);
      gg.setMaxEdges(edges);
      gg.setProcessor(this);
      gg.sanitizeParams();
      try {
        gg.run(GenerateGraphs.TRIANGLE_FREE | GenerateGraphs.SQUARE_FREE, 0, 0);
      } catch (final RuntimeException e) {
        if ("found".equals(e.getMessage())) {
          return Z.valueOf(edges);
        }
        throw e;
      }
      --edges;
    }
  }
}

