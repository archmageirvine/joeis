package irvine.oeis.a392;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A392962 allocated for Igor Blokhin.
 * @author Sean A. Irvine
 */
public class A392962 extends ParallelGenerateGraphsSequence {

  private static final class MyCounter implements Counter {
    private final Map<Z, Long> mAut = new HashMap<>();

    @Override
    public long getCount(final Graph graph) {
      mAut.merge(GraphUtils.automorphismSize(graph), 1L, Long::sum);
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
      // Merge all the maps
      final Map<Z, Long> map = new HashMap<>();
      for (final MyCounter c : mCounters) {
        for (final Map.Entry<Z, Long> e : c.mAut.entrySet()) {
          map.merge(e.getKey(), e.getValue(), Long::sum);
        }
      }
      // Now count the unique cases
      long cnt = 0;
      for (final Long v : map.values()) {
        if (v == 1) {
          ++cnt;
        }
      }
      return Z.valueOf(cnt);
    }
  }

  private static final MySupplier SUPPLIER = new MySupplier();

  /** Construct the sequence. */
  public A392962() {
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
