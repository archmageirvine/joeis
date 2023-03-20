package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062078 LCM of the digits of n.
 * @author Sean A. Irvine
 */
public class A062078 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long lcm = 1;
    while (m != 0) {
      lcm = LongUtils.lcm(lcm, m % 10);
      m /= 10;
    }
    return Z.valueOf(lcm);
  }
}
