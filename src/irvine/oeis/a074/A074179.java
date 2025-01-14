package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074179 a(1) = 1, a(n) = smallest multiple of n divisible by the sum of all previous terms.
 * @author Sean A. Irvine
 */
public class A074179 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z res = mSum.lcm(mN);
    mSum = mSum.add(res);
    return res;
  }
}
