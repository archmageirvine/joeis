package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051193 a(n) = Sum_{k=1..n} lcm(n,k).
 * @author Sean A. Irvine
 */
public class A051193 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(LongUtils.lcm(mN, k));
    }
    return sum;
  }
}
