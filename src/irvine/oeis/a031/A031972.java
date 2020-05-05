package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031972 <code>a(n) = Sum_{k=1..n} n^k</code>.
 * @author Sean A. Irvine
 */
public class A031972 implements Sequence {

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
