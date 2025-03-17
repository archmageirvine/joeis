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

  /** Construct the sequence. */
  public A007134() {
    super(() -> graph -> isChordal(graph) ? labellings(graph) : 0);
  }

  private static long labellings(final Graph graph) {
    final StatsBlk stats = new StatsBlk();
    new Nauty(graph, new int[graph.order()], new int[graph.order()], new NautySet(graph.order()), new int[graph.order()], new OptionBlk(), stats, new long[100]);
    return Functions.FACTORIAL.z(graph.order()).divide(stats.groupSize()).longValue();
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    super.graphGenInit(gg);
  }
}

