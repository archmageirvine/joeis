package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047079 a(n) = Sum_{i=0..floor(n/2)} A047072(i, n-2*i).
 * @author Sean A. Irvine
 */
public class A047079 extends A047072 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(k, mN - 2 * k));
    }
    return sum;
  }
}
