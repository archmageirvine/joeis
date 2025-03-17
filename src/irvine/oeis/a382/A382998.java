package irvine.oeis.a382;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.graph.Graph;
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
public class A382998 extends ParallelGenerateGraphsSequence {

  // Not correct number

  private final Set<Graph> mSet = Collections.synchronizedSet(new HashSet<>());

  /** Construct the sequence. */
  public A382998() {
    super(-1, -1, false, false, false);
  }

  private static Graph square(final Graph graph) {
    final Graph square = graph.copy();
    // Look for paths like v - u - w, then connect v - w
    for (int u = 0; u < graph.order(); ++u) {
      for (int v = graph.nextVertex(u, -1); v >= 0; v = graph.nextVertex(u, v)) {
        for (int w = graph.nextVertex(u, v); w >= 0; w = graph.nextVertex(u, w)) {
          square.addEdge(v, w);
        }
      }
    }
    final int[] lab = new int[graph.order()];
    final int[] ptn = new int[graph.order()];
    final int[] orb = new int[graph.order()];
    final NautySet set = new NautySet(graph.order());
    final StatsBlk stats = new StatsBlk();
    final OptionBlk opt = new OptionBlk();
    opt.setCanon(1);
    return new Nauty(square, lab, ptn, set, orb, opt, stats, new long[100]).canon();
  }

  @Override
  public long getCount(final Graph graph) {
    return mSet.add(square(graph)) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setMinDeg(1);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    mSet.clear();
    return super.next();
  }
}
