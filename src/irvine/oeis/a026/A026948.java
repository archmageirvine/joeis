package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026948 <code>a(n) = Sum{T(n,k)*T(n,k+2)}, 0&lt;=k&lt;=n-2</code>, T given by <code>A026374</code>.
 * @author Sean A. Irvine
 */
public class A026948 extends A026374 {
  
  {
    nextRow();
    nextRow();
  }

  @Override
  public Z next() {
    nextRow();
    Z sum = Z.ZERO;
    for (int k = 0; k < mN - 1; ++k) {
      sum = sum.add(mGfRow.coeff(k).multiply(mGfRow.coeff(mN - k - 2)));
    }
    return sum;
  }
}
