package irvine.oeis.a068;

import irvine.math.graph.GraphFactory;
import irvine.math.graph.MaximumIndependentSet;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068940 Maximum number of chess queens that can be placed on a 3-dimensional chessboard of order n so that no two queens attack each other.
 * @author Sean A. Irvine
 */
public class A068940 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(MaximumIndependentSet.size(GraphFactory.queensGraph(3, ++mN)));
  }
}

