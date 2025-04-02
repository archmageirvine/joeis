package irvine.oeis.a381;

import java.util.Arrays;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076323.
 * @author Sean A. Irvine
 */
public class A381765 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A381765() {
    super(0, -1, 0, 0, () -> graph -> {
      final int[] deg = new int[graph.order()];
      for (int k = 0; k < deg.length; ++k) {
        deg[k] = (int) graph.degree(k);
      }
      Arrays.sort(deg);
      for (int k = 1; k < deg.length; ++k) {
        if (deg[k] > deg[k - 1] + 1) {
          return 0;
        }
      }
      return 1;
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
