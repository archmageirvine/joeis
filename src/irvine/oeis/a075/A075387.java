package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075387 Product of terms of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075387 extends A075383 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod;
  }
}
