package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027682 Number of independent subsets of Hamming graph H(n,4).
 * @author Sean A. Irvine
 */
public class A027682 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(GraphFactory.hamming(++mN, 4)));
  }
}
