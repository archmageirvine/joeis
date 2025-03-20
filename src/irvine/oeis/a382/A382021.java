package irvine.oeis.a382;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A382021 Number of distinct degree sequences among all simple graphs with n vertices whose degrees are consecutive integers.
 * @author Sean A. Irvine
 */
public class A382021 extends ParallelGenerateGraphsSequence {

  private static final Set<String> CONSEC_DEGREE_SEQUENCES = Collections.synchronizedSet(new HashSet<>());

  /** Construct the sequence. */
  public A382021() {
    super(-1, -1, false, false, false, () -> graph -> {
      final long[] deg = new long[graph.order()];
      for (int k = 0; k < deg.length; ++k) {
        deg[k] = graph.degree(k);
      }
      Arrays.sort(deg);
      for (int k = 1; k < deg.length; ++k) {
        if (deg[k] - deg[k - 1] > 1) {
          return 0;
        }
      }
      return CONSEC_DEGREE_SEQUENCES.add(Arrays.toString(deg)) ? 1 : 0;
    });
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

  @Override
  public Z next() {
    CONSEC_DEGREE_SEQUENCES.clear();
    return super.next();
  }
}
