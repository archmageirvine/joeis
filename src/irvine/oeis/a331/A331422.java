package irvine.oeis.a331;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A331422 Triangle T(n, k) of the number of connected graphs of order n with cutting number k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A331422 extends Sequence1 implements GraphProcessor {

  private int mN = 0;
  private int mM = 0;
  private long[] mCounts = new long[0];

  @Override
  public void process(final Graph graph) {
    ++mCounts[GraphUtils.cuttingNumber(graph)];
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
      gg.setMaxEdges(mN * (mN - 1) / 2);
      gg.setConnectionLevel(1);
      gg.setProcessor(this);
      gg.sanitizeParams();
      gg.run(0, 0, 0);
    }
    return Z.valueOf(mCounts[mM]);
  }
}
