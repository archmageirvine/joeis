package irvine.oeis.a054;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054926 Number of connected unlabeled graphs with n nodes and floor(n*(n-1)/4) edges.
 * @author Sean A. Irvine
 */
public class A054926 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return GraphUtils.numberUnlabelledConnectedGraphs(++mN, mN * (mN - 1) / 4);
  }
}
