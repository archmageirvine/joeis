package irvine.oeis.a036;

import irvine.math.LongUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036391.
 * @author Sean A. Irvine
 */
public class A036391 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final IntegersModMul mod = new IntegersModMul(mN);
    for (long k = 1; k < mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1) {
        sum = sum.add(mod.order(Z.valueOf(k)));
      }
    }
    return sum;
  }
}

