package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027624 Number of independent vertex sets in the n-hypercube graph <code>Q_n</code>.
 * @author Sean A. Irvine
 */
public class A027624 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(GraphFactory.hypercube(++mN)));
  }
}
