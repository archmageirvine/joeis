package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051623 a(n) = Sum_{x=1+floor(sqrt(n))..floor(sqrt(2n))} (x^2 - n).
 * @author Sean A. Irvine
 */
public class A051623 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1 + LongUtils.sqrt(mN); k <= LongUtils.sqrt(2 * mN); ++k) {
      sum = sum.add(k * k - mN);
    }
    return sum;
  }
}
