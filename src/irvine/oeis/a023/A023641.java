package irvine.oeis.a023;

import java.io.IOException;

import irvine.math.IntegerUtils;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A023641.
 * @author Sean A. Irvine
 */
public class A023641 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A023641() {
    super(6, 7, false, false, false);
  }

  private final StatsBlk mNautyStats = new StatsBlk();

  @Override
  protected boolean accept(final Graph graph) {
    final int[] orbits = new int[graph.order()];
    try {
      new Nauty(graph, new int[graph.order()], new int[graph.order()], null, orbits, new OptionBlk(), mNautyStats, new long[50]);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println(Arrays.toString(orbits));
    return IntegerUtils.isZero(orbits);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN);
    gg.setMaxEdges(3 * mN);
    gg.setMinDeg(6);
    gg.setMaxDeg(6);
    gg.setConnectionLevel(1);
  }
}
