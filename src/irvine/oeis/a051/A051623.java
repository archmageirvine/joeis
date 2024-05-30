package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051623 a(n) = Sum_{x=1+floor(sqrt(n))..floor(sqrt(2n))} (x^2 - n).
 * @author Sean A. Irvine
 */
public class A051623 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1 + Functions.SQRT.l(mN); k <= Functions.SQRT.l(2 * mN); ++k) {
      sum = sum.add(k * k - mN);
    }
    return sum;
  }
}
