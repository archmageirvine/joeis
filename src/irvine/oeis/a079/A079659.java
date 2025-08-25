package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A079659 Nonunit step integers of double-loop digraphs.
 * @author Sean A. Irvine
 */
public class A079659 extends Sequence1 {

  // HEURISTIC_MAX limits how far the search is made on s1
  //private static final int HEURISTIC_MAX = Integer.MAX_VALUE; // Fully deterministic
  private static final int HEURISTIC_MAX = 3; // Sufficient for all known terms <= 4868
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 449;

  private int d(final int n, final int s1, final int s2) {
    final Graph g = GraphFactory.createDigraph(n);
    for (int v = 0; v < n; ++v) {
      g.addEdge(v, (v + s1) % n);
      g.addEdge(v, (v + s2) % n);
    }
    return Functions.MAX.i(g.distanceVector(0));
  }

  private int d1(final int n) {
    int d = n;
    for (int s2 = 2; s2 < n; ++s2) {
      d = Math.min(d, d(n, 1, s2));
    }
    return d;
  }

  private boolean is(final int n) {
    if (mVerbose) {
      StringUtils.message("Trying: n=" + n);
    }
    final int d1 = d1(n);
    final int max = n <= 4686 ? 3 : Math.min(n - 1, HEURISTIC_MAX);
    for (int s1 = 2; s1 <= max; ++s1) {
      for (int s2 = s1 + 1; s2 < n; ++s2) {
        if (Functions.GCD.i(n, s1, s2) == 1) {
          final int d = d(n, s1, s2);
          if (d < d1) {
            if (mVerbose) {
              StringUtils.message(n + " D1=" + d1 + " D<=" + d + " (s1=" + s1 + ", s2=" + s2 + ")");
            }
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }

  /**
   * Test if the specified integer is a nus.
   * @param args integer to test
   */
  public static void main(final String... args) {
    System.out.println(new A079659().is(Integer.parseInt(args[0])));
  }
}

