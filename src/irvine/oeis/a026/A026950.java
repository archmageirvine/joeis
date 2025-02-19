package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026950 a(n) = Sum_{k=0..n} (k+1) * T(n,k), with T given by A026374.
 * @author Sean A. Irvine
 */
public class A026950 extends A026374 {

  @Override
  public Z next() {
    nextRow();
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mGfRow.coeff(k).multiply(k + 1));
    }
    return sum;
  }
}
