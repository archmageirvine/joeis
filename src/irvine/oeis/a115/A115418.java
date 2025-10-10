package irvine.oeis.a115;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A115418 a(n) is the shortest possible n-th-power loop where an n-th-power loop of length m &gt; 1 is a circular permutation of the numbers 1 to m such that the sum of any two consecutive numbers is a perfect n-th power.
 * @author Sean A. Irvine
 */
public class A115418 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private boolean isN(final int sum) {
    final Z root = Z.valueOf(sum).root(mN);
    return root.auxiliary() == 1;
  }

  private Graph buildGraph(final int m) {
    final Graph g = GraphFactory.create(m);
    for (int k = 1; k <= m; ++k) {
      for (int j = 1; j <= m; ++j) {
        if (k != j && isN(k + j)) {
          g.addEdge(k - 1, j - 1); // graph vertices numbered from 0
        }
      }
    }
    return g;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    int m = 1;
    while (true) {
      ++m;
      if (mVerbose) {
        StringUtils.message("n=" + mN + " trying m=" + m);
      }
      if (buildGraph(m).isHamiltonian()) {
        return Z.valueOf(m);
      }
    }
  }
}
