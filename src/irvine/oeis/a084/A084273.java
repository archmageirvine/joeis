package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A084273 Number of labeled connected 3-chromatic (i.e., chromatic number = 3) graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A084273 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A084273() {
    super(1, 0, 0, 0, () -> graph -> GraphUtils.chromaticNumber(graph) == 3 ? Functions.FACTORIAL.z(graph.order()).divide(GraphUtils.automorphismSize(graph)).longValueExact() : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
