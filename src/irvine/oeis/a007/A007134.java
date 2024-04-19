package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.oeis.a048.A048192;

/**
 * A007134 Number of connected labeled chordal graphs (or triangulated graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A007134 extends A048192 {

  private long labellings(final Graph graph) {
    final StatsBlk stats = new StatsBlk();
    new Nauty(graph, new int[mN], new int[mN], new NautySet(mN), new int[mN], new OptionBlk(), stats, new long[100]);
    return Functions.FACTORIAL.z(graph.order()).divide(stats.groupSize()).longValue();
  }

  @Override
  protected long getCount(final Graph graph) {
    return isChordal(graph) ? labellings(graph) : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    super.graphGenInit(gg);
  }
}

