package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062081 Group the even numbers as (2,4), (6,8,10,12), (14,16,18,20,22,24), (26,28,30,32,34,36,38,40), ... then a(n) = LCM of the n-th group.
 * @author Sean A. Irvine
 */
public class A062081 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mN += 2;
    Z lcm = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      mM += 2;
      lcm = lcm.lcm(Z.valueOf(mM));
    }
    return lcm;
  }
}
