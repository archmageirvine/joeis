package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047131 a(n) = Sum_{i=0..n} A047130(i, n-i).
 * @author Sean A. Irvine
 */
public class A047131 extends A047130 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(k, mN - k));
    }
    return sum;
  }
}
