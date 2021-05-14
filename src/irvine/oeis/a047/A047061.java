package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047061 a(n) = Sum_{i=0..n} A047060(i,n-i).
 * @author Sean A. Irvine
 */
public class A047061 extends A047060 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long m = 0; m < mN; ++m) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
