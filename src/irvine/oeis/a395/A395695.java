package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.graph.MaximumIndependentSet;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A395695 Triangle read by rows: T(n,k) = number of labeled simple graphs on n vertices with clique number &lt;= k (K_{k+1}-free graphs).
 * @author Sean A. Irvine
 */
public class A395695 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Z[] mCounts = null;
  private Object[] mLocks = null; // Used for safe parallelism
  private Z mRowSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mRowSum = Z.ZERO;
      mCounts = new Z[mN + 1];
      mLocks = new Object[mN + 1];
      for (int k = 1; k < mLocks.length; ++k) {
        mLocks[k] = new Object();
        mCounts[k] = Z.ZERO;
      }
      new ParallelGenerateGraphsSequence(mN, mN - 1, 0, 0, () -> graph -> {
        final Z labellings = Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph));
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
    mRowSum = mRowSum.add(mCounts[mM]);
    return mRowSum;
  }
}
