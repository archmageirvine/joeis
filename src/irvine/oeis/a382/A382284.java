package irvine.oeis.a382;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A382180 Number of unlabeled connected graphs with n vertices which are squares.
 * @author Sean A. Irvine
 */
public class A382284 extends ParallelGenerateGraphsSequence {

  private static final Set<Graph> SQUARE_GRAPHS = Collections.synchronizedSet(new HashSet<>());

  /** Construct the sequence. */
  public A382284() {
    super(-1, -1, false, false, false, () -> new Counter() {
      private final long[] mWorkspace = new long[100];
      private int[] mLab = {};
      private int[] mPtn = {};
      private int[] mOrb = {};
      private NautySet mNautySet = new NautySet(0);
      private final StatsBlk mStatsBlk = new StatsBlk();
      private final OptionBlk mOpt = new OptionBlk();
      {
        mOpt.setCanon(1);
      }

      private Graph square(final Graph graph) {
        final Graph square = GraphUtils.square(graph);
        if (graph.order() != mLab.length) {
          mLab = new int[graph.order()];
          mPtn = new int[graph.order()];
          mOrb = new int[graph.order()];
          mNautySet = new NautySet(graph.order());
        }
        return new Nauty(square, mLab, mPtn, mNautySet, mOrb, mOpt, mStatsBlk, mWorkspace).canon();
      }

      @Override
      public long getCount(final Graph graph) {
        final Graph square = square(graph);
        // Although individual set add is faster than planar test, we can do planar in parallel
        return square.isPlanar() && SQUARE_GRAPHS.add(square) ? 1 : 0;
      }
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(1);
    gg.setMaxDeg(4); // higher than 5 -> square will be nonplanar
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    SQUARE_GRAPHS.clear();
    return super.next().max(Z.ONE);
  }
}
