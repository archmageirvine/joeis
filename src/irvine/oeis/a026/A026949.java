package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026949 <code>a(n) = Sum{T(n,k)*T(n,k+3)}, 0&lt;=k&lt;=n-3</code>, T given by <code>A026374</code>.
 * @author Sean A. Irvine
 */
public class A026949 extends A026374 {
  
  {
    nextRow();
    nextRow();
    nextRow();
  }

  @Override
  public Z next() {
    nextRow();
    Z sum = Z.ZERO;
    for (int k = 0; k < mN - 2; ++k) {
      sum = sum.add(mGfRow.coeff(k).multiply(mGfRow.coeff(mN - k - 3)));
    }
    return sum;
  }
}
