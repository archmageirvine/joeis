package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006580.
 * @author Sean A. Irvine
 */
public class A006580 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(LongUtils.lcm(mN - k, k));
    }
    return sum;
  }
}
