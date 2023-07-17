package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026949 a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3), with T given by A026374.
 * @author Sean A. Irvine
 */
public class A026949 extends A026374 {

  /** Construct the sequence. */
  public A026949() {
    super(3);
  }

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
