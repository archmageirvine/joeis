package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026955 a(n) = Sum_{k=0..n} (k+1) * T(n,k), with T given by A026386.
 * @author Sean A. Irvine
 */
public class A026955 extends A026386 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
