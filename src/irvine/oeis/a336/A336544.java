package irvine.oeis.a336;

import java.io.IOException;
import java.util.HashSet;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A336544.
 * @author Sean A. Irvine
 */
public class A336544 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A336544() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    final HashSet<Graph> subgraphs = new HashSet<>();
    final OptionBlk options = new OptionBlk();
    options.setCanon(1);
    final long[] workspace = new long[100];
    final int n = graph.order() - 1;
    final int[] lab = new int[n];
    final int[] ptn = new int[n];
    final int[] orb = new int[n];
    final NautySet set = new NautySet(n);
    final StatsBlk stats = new StatsBlk();
    try {
      for (int k = 0; k < graph.order(); ++k) {
        final Graph s = graph.delete(k);
        subgraphs.add(new Nauty(s, lab, ptn, set, orb, options, stats, workspace).canon());
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println(graph + " " + subgraphs.size() + " " + subgraphs);
    return subgraphs.size();
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(0);
  }
}
