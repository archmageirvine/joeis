package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A395158 Number of 2-connected claw-free labeled cubic graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A058929 extends ParallelGenerateGraphsSequence {

  private static final class MyCounter implements Counter {
    private Z mSum = Z.ZERO;

    @Override
    public long getCount(final Graph g) {
      mSum = mSum.add(Functions.FACTORIAL.z(g.order()).divide(GraphUtils.automorphismSize(g)));
      return 0;
    }
  }

  private static final class MySupplier implements Supplier<Counter> {
    private final List<MyCounter> mCounters = new ArrayList<>();

    private void clear() {
      mCounters.clear();
    }

    @Override
    public Counter get() {
      final MyCounter counter = new MyCounter();
      mCounters.add(counter);
      return counter;
    }

    private Z totalCount() {
      Z total = Z.ZERO;
      for (final MyCounter c : mCounters) {
        total = total.add(c.mSum);
      }
      return total;
    }
  }

  private static final MySupplier SUPPLIER = new MySupplier();

  /** Construct the sequence. */
  public A058929() {
    super(0, 0, 0, SUPPLIER);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(2 * mN * (2 * mN - 1) / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setConnectionLevel(2);
    gg.setPruner((g, n) -> !GraphUtils.isClawFree(g));
  }

  @Override
  public Z next() {
    SUPPLIER.clear();
    super.next();
    return SUPPLIER.totalCount();
  }
}
