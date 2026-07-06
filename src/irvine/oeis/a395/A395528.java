package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A395528 allocated for Nevan Torres.
 * @author Sean A. Irvine
 */
public class A395528 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  private Z[] mCounts = {};
  private Object[] mLocks = null; // Used for safe parallelism

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      ++mN;
      mM = 1;
      mCounts = new Z[Functions.CEIL_SQRT.i(mN) + 1];
      mLocks = new Object[mCounts.length];
      for (int k = 1; k < mCounts.length; ++k) {
        mLocks[k] = new Object();
        mCounts[k] = Z.ZERO;
      }
      new ParallelGenerateGraphsSequence(mN, mN - 1, 0, 0, () -> graph -> {
        final int burning = GraphUtils.burningNumber(graph);
        synchronized (mLocks[burning]) {
          mCounts[burning] = mCounts[burning].add(1);
        }
        return 1;
      }) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          // trees
          gg.setVertices(mN);
          gg.setMinEdges(mN - 1);
          gg.setMaxEdges(mN - 1);
          gg.setConnectionLevel(1);
        }
      }.next();
      //System.out.println(mN + " " + Arrays.toString(mCounts));
    }
    return mCounts[mM];
  }
}
