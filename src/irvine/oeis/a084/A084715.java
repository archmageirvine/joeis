package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A084715 Smallest number of the form n*k + 1 that is divisible by all the phi(n) numbers less than n and relatively prime to n.
 * @author Sean A. Irvine
 */
public class A084715 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.THREE;
    }
    Z g = Z.ONE;
    for (long j = 2; j < mN; ++j) {
      if (Functions.GCD.l(j, mN) == 1) {
        g = g.lcm(j);
      }
    }
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ONE, Z.ZERO}, new Z[] {Z.valueOf(mN), g});
  }
}
