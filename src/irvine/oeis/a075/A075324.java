package irvine.oeis.a075;

import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075324 Independent domination number for queens' graph Q(n).
 * @author Sean A. Irvine
 */
public class A075324 extends Sequence1 {

  // Only good for a few terms

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(GraphUtils.independentDominationNumber(GraphFactory.queens(2, ++mN)));
  }
}
