package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047084 a(n) = Sum_{i=0..n} A047080(i,n-i).
 * @author Sean A. Irvine
 */
public class A047084 extends A047080 {

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
