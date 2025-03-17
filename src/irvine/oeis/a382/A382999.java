package irvine.oeis.a382;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A003094.
 * @author Sean A. Irvine
 */
public class A382999 extends ParallelGenerateGraphsSequence {

  // Not correct number

  private static final Set<Graph> SQUARE_GRAPHS = Collections.synchronizedSet(new HashSet<>());

  /** Construct the sequence. */
  public A382999() {
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
        final Graph square = graph.copy();
        // Look for paths like v - u - w, then connect v - w
        for (int u = 0; u < graph.order(); ++u) {
          for (int v = graph.nextVertex(u, -1); v >= 0; v = graph.nextVertex(u, v)) {
            for (int w = graph.nextVertex(u, v); w >= 0; w = graph.nextVertex(u, w)) {
              square.addEdge(v, w);
            }
          }
        }
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
        return SQUARE_GRAPHS.add(square(graph)) ? 1 : 0;
      }
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    //gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    SQUARE_GRAPHS.clear();
    return super.next();
  }
}
