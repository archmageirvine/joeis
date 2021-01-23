package irvine.oeis.a331;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A331238 Triangle T(n, k) of the number of trees of order n with cutting number k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A331238 implements Sequence, GraphProcessor {

  private int mN = 0;
  private int mM = 0;
  private long[] mCounts = new long[0];

  @Override
  public void process(final Graph graph) {
    ++mCounts[GraphUtils.cuttingNumberOfTree(graph)];
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      mCounts = new long[mN * (mN - 1) / 2 + 1];
      ++mN;
      mM = 0;
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setVertices(mN);
      gg.setMinEdges(mN - 1);
      gg.setMaxEdges(mN - 1); // trees
      gg.setConnectionLevel(1);
      gg.setProcessor(this);
      gg.sanitizeParams();
      try {
        gg.run(false, false, false, 0, 0);
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
    }
    return Z.valueOf(mCounts[mM]);
  }
}
