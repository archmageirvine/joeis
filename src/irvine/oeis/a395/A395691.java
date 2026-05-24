package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.graph.MaximumIndependentSet;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A395691 allocated for Alejandro Zarzuelo Urdiales.
 * @author Sean A. Irvine
 */
public class A395691 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Z[] mCounts = null;
  private Object[] mLocks = null; // Used for safe parallelism

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mCounts = new Z[mN + 1];
      mLocks = new Object[mN + 1];
      for (int k = 1; k < mLocks.length; ++k) {
        mLocks[k] = new Object();
        mCounts[k] = Z.ZERO;
      }
      final long maxe = (long) mN * (mN - 1) / 2;
      new ParallelGenerateGraphsSequence(mN, mN - 1, 0, 0, () -> graph -> {
        final Z labellings = Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph)).shiftLeft(maxe - graph.size());
        final int i = MaximumIndependentSet.size(graph);
        synchronized (mLocks[i]) {
          mCounts[i] = mCounts[i].add(labellings);
        }
        return 1;
      }) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(0);
          gg.setMaxEdges(mN * (mN - 1) / 2);
        }
      }.next();
    }
    return mCounts[mM];
  }
}
