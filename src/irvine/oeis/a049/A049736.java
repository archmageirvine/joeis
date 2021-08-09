package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049736 a(n) = Sum_{i=0..n} T(i,n-i), array T as in A049735.
 * @author Sean A. Irvine
 */
public class A049736 extends A049735 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(k, mN - k));
    }
    return sum;
  }
}
