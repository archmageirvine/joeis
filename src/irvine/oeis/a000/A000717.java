package irvine.oeis.a000;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008406;

/**
 * A000717 Number of graphs with n nodes and floor(n(n-1)/4) edges.
 * @author Sean A. Irvine
 */
public class A000717 implements Sequence {

  private final A008406 mGraphCount = new A008406();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return GraphUtils.numberUnlabelledGraphs(mN, mN * (mN - 1) / 4);
  }
}
