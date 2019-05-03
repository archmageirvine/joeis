package irvine.oeis.a020;

import irvine.math.z.BellNumbers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020561 Number of ordered oriented multigraphs on n labeled arcs <code>(with loops)</code>.
 * @author Sean A. Irvine
 */
public class A020561 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(BellNumbers.bell(2 * k).multiply(Stirling.firstKind(mN, k)).abs());
    }
    return sum;
  }
}
