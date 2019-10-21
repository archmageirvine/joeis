package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026946 Self-convolution of array T given by <code>A026374</code>.
 * @author Sean A. Irvine
 */
public class A026946 extends A026374 {

  @Override
  public Z next() {
    nextRow();
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mGfRow.coeff(k).multiply(mGfRow.coeff(mN - k)));
    }
    return sum;
  }
}
