package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020561 Number of ordered oriented multigraphs on n labeled arcs (with loops).
 * @author Sean A. Irvine
 */
public class A020561 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.BELL.z(2 * k).multiply(Stirling.firstKind(mN, k)).abs());
    }
    return sum;
  }
}
