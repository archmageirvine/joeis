package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026982 <code>a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1)</code>, with T given by <code>A026670</code>.
 * @author Sean A. Irvine
 */
public class A026982 extends A026670 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 1)));
    }
    return sum;
  }
}
