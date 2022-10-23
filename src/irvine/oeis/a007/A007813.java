package irvine.oeis.a007;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007813 Number of planar Steinhaus graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007813 extends Sequence1 {

  private static final Z Z26 = Z.valueOf(26);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 15) {
      return Z26;
    }
    long count = 0;
    for (long u = 0; u < 1L << (mN - 1); ++u) {
      final Graph g = GraphFactory.steinhaus(mN, u);
      if (g.isPlanar()) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
