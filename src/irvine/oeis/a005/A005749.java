package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005749 Cascade-realizable Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005749 extends A005613 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final int n = size();
    super.next();
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(a(n - k)));
    }
    return sum;
  }
}
