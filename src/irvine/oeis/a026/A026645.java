package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026645 a(n) = Sum_{k=0..floor(n/2)} A026637(n, k).
 * @author Sean A. Irvine
 */
public class A026645 extends A026637 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
