package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056548 a(n) = Sum_{k&gt;=1} round(n/k) where round(1/2) = 0.
 * @author Sean A. Irvine
 */
public class A056548 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * mN; ++k) {
      sum = sum.add((2 * mN + k) / (2 * k));
      if ((k & 1) == 1 && mN % k == 0) {
        sum = sum.subtract(1);
      }
    }
    return sum;
  }
}
