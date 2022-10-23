package irvine.oeis.a006;

import irvine.math.graph.GraphFactory;
import irvine.math.graph.MaximumIndependentSet;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006946 Independence number of De Bruijn graph of order n on two symbols.
 * @author Sean A. Irvine
 */
public class A006946 extends Sequence1 {

  // Only good for a few terms

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(MaximumIndependentSet.size(GraphFactory.createDeBruijn2(++mN)));
  }
}
