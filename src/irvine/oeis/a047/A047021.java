package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047021 a(n) = Sum_{i=0..n} T(i,n-i) where T is given by A047020.
 * @author Sean A. Irvine
 */
public class A047021 extends A047020 {

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
