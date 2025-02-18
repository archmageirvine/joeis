package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075386 Sum of terms of n-th group in A075383.
 * @author Sean A. Irvine
 */
public class A075386 extends A075383 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
