package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000055.
 * @author Sean A. Irvine
 */
public class A000055 extends A000081 {

  @Override
  public Z next() {
    final int n = size();
    super.next();
    if (n < 4) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    if ((n & 1) == 0) {
      sum = sum.subtract(get(n / 2));
    }
    return get(n).subtract(sum.divide(2));
  }

}

