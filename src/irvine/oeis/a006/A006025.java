package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006025 Number of labeled mating digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A006025 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).shiftLeft(k * (k - 1)));
    }
    return sum;
  }
}
