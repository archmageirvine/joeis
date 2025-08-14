package irvine.oeis.a048;

import java.util.function.Supplier;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A048192 Number of connected chordal graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A048192 extends ParallelGenerateGraphsSequence {

  protected A048192(final Supplier<Counter> counterSupplier) {
    super(0, 0, 0, counterSupplier);
  }

  /** Construct the sequence. */
  public A048192() {
    this(() -> graph -> graph.isChordal() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1));
  }
}

