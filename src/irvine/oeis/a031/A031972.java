package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031972 a(n) = Sum_{k=1..n} n^k.
 * @author Sean A. Irvine
 */
public class A031972 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    Z sum = Z.ZERO;
    Z m = n;
    for (int k = 1; k <= mN; ++k, m = m.multiply(n)) {
      sum = sum.add(m);
    }
    return sum;
  }
}
