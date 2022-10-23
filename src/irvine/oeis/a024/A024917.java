package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024917 a(n) = Sum_{k=2..n} k*floor(n/k).
 * @author Sean A. Irvine
 */
public class A024917 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).multiply(mN / k));
    }
    return sum;
  }
}
