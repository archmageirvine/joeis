package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026947 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026374.
 * @author Sean A. Irvine
 */
public class A026947 extends A026374 {

  /** Construct the sequence. */
  public A026947() {
    super(1);
  }

  {
    nextRow();
  }

  @Override
  public Z next() {
    nextRow();
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(mGfRow.coeff(k).multiply(mGfRow.coeff(mN - k - 1)));
    }
    return sum;
  }
}
