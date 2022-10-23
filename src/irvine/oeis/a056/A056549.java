package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056549 a(n) = Sum_{k&gt;=1} round(n/k) where round(1/2)=1.
 * @author Sean A. Irvine
 */
public class A056549 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * mN; ++k) {
      sum = sum.add((2 * mN + k) / (2 * k));
    }
    return sum;
  }
}
