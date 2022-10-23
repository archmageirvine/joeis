package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A027996 a(n)=Sum{T(n,k)*T(n,k+2)}, 0&lt;=k&lt;=2n-2, T given by A027926.
 * @author Sean A. Irvine
 */
public class A027996 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN - 1; ++m) {
      sum = sum.add(A027926.t(mN, m).multiply(A027926.t(mN, m + 2)));
    }
    return sum;
  }
}
