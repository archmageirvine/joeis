package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027667 Number of independent subsets of nodes of <code>3^n</code> cube <code>(P_3</code> X ... X <code>P_3)</code>.
 * @author Sean A. Irvine
 */
public class A027667 implements Sequence {

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
