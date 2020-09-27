package irvine.oeis.a035;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035098.
 * @author Sean A. Irvine
 */
public class A035098 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply((k + 1) * (k + 2) / 2 + 1));
    }
    return sum;
  }
}
