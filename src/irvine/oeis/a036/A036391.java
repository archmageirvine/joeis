package irvine.oeis.a036;

import irvine.math.LongUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036391 a(n) = sum of order of a mod n, 0 &lt; a &lt; n, gcd(a, n) = 1.
 * @author Sean A. Irvine
 */
public class A036391 extends Sequence1 {

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

