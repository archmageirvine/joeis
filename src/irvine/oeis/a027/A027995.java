package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027995 <code>a(n)=Sum{T(n,k)*T(n,k+1)}, 0&lt;=k&lt;=2n-1</code>, T given by <code>A027926</code>.
 * @author Sean A. Irvine
 */
public class A027995 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN; ++m) {
      sum = sum.add(A027926.t(mN, m).multiply(A027926.t(mN, m + 1)));
    }
    return sum;
  }
}
