package irvine.oeis.a392;

import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075324.
 * @author Sean A. Irvine
 */
public class A392963 extends Sequence2 {

  // Only good for a few terms

  private int mN = 2;
  private int mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(GraphUtils.independentDominationNumber(GraphFactory.kneser(mN, mM)));
  }
}
