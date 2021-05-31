package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048114 a(n) = Sum{T(n,i): i=0,1,...,n}, where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048114 extends A048113 {

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
