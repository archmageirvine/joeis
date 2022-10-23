package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027667 Number of independent subsets of nodes of 3^n cube (P_3 X ... X P_3).
 * @author Sean A. Irvine
 */
public class A027667 extends Sequence0 {

  private int mN = -1;

  // P_3 (cf. A027667 where this is P_4)
  protected int pathLength() {
    return 3;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(GraphFactory.pathPowerGraph(pathLength(), ++mN)));
  }
}
