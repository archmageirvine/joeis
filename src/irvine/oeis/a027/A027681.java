package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027681.
 * @author Sean A. Irvine
 */
public class A027681 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(GraphFactory.hamming(++mN, 3)));
  }
}
