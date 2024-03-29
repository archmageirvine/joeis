package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a048.A048149;

/**
 * A049714 a(n) = Sum_{i=0..floor(n/2)} T(2i,n-2i), array T as in A048149.
 * @author Sean A. Irvine
 */
public class A049714 extends A048149 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; k += 2) {
      sum = sum.add(get(k, mN - k));
    }
    return sum;
  }
}
