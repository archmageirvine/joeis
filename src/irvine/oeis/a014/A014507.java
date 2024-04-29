package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014507 Number of digraphs with loops, having unlabeled (non-isolated) nodes and n labeled edges.
 * @author Sean A. Irvine
 */
public class A014507 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).multiply(Functions.BELL.z(2 * k)));
    }
    return sum;
  }
}
