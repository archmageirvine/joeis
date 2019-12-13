package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027985 <code>a(n) = Sum{T(n,k)*T(n,k+1)}, 0&lt;=k&lt;=2n-1</code>, T given by <code>A027960</code>.
 * @author Sean A. Irvine
 */
public class A027985 extends A027960 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < 2 * mN; ++m) {
      sum = sum.add(get(mN, m).multiply(get(mN, m + 1)));
    }
    return sum;
  }
}
