package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047083 a(n) = Sum_{i=0..floor((n+1)/2} A047080(n,i).
 * @author Sean A. Irvine
 */
public class A047083 extends A047080 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
