package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006024.
 * @author Sean A. Irvine
 */
public class A006024 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).shiftLeft(k * (k - 1) / 2));
    }
    return sum;
  }
}
