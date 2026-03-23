package irvine.oeis.a394;

import java.util.concurrent.atomic.AtomicLong;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A394473 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A394473 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private AtomicLong[] mCounts = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mCounts = new AtomicLong[mN + 1];
      for (int k = 1; k <= mN; ++k) {
        mCounts[k] = new AtomicLong();
      }
      new ParallelGenerateGraphsSequence(mN, mN - 1, 0, 0, () -> graph -> {
        mCounts[GraphUtils.chromaticNumber(graph)].addAndGet(Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph)).longValueExact());
        return 1;
      }) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(0);
          gg.setMaxEdges(mN * (mN - 1) / 2);
          gg.setConnectionLevel(0);
        }
      }.next();
    }
    return Z.valueOf(mCounts[mM].get());
  }
}
