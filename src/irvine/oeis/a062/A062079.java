package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062079 Group the odd numbers as (1), (3,5), (7,9,11), (13,15,17,19), (21,23,25,27,29), ... then a(n) = LCM of the n-th group.
 * @author Sean A. Irvine
 */
public class A062079 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      mM += 2;
      lcm = lcm.lcm(Z.valueOf(mM));
    }
    return lcm;
  }
}
