package irvine.oeis.a014;

import irvine.math.graph.Graph;
import irvine.math.z.Z;
import irvine.oeis.a006.A006924;

/**
 * A014374 Number of trivalent connected simple graphs with <code>2n</code> nodes and girth at least 6.
 * @author Sean A. Irvine
 */
public class A014374 extends A006924 {

  @Override
  protected Z initial() {
    return Z.ONE;
  }

  @Override
  public void process(final Graph graph) {
    if (graph.girth() >= 6) {
      ++mCount;
    }
  }
}

