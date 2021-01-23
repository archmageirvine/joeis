package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027997 Sum{T(n,k)*T(n,k+3)}, 0&lt;=k&lt;=2n-3, T given by A027926.
 * @author Sean A. Irvine
 */
public class A027997 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN - 2; ++m) {
      sum = sum.add(A027926.t(mN, m).multiply(A027926.t(mN, m + 3)));
    }
    return sum;
  }
}
