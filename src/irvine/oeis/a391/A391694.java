package irvine.oeis.a391;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A391694 allocated for Igor Blokhin.
 * @author Sean A. Irvine
 */
public class A391694 extends ParallelGenerateGraphsSequence {

  private static final class MyCounter implements Counter {
    private final Set<Z> mAut = new HashSet<>();

    @Override
    public long getCount(final Graph graph) {
      mAut.add(GraphUtils.automorphismSize(graph));
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
      final Set<Z> set = new HashSet<>();
      for (final MyCounter c : mCounters) {
        set.addAll(c.mAut);
      }
      return Z.valueOf(set.size());
    }
  }

  private static final MySupplier SUPPLIER = new MySupplier();

  /** Construct the sequence. */
  public A391694() {
    super(0, 1, 0, SUPPLIER);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    SUPPLIER.clear();
    super.next();
    return SUPPLIER.totalCount();
  }
}
