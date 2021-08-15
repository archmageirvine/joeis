package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028819 Numbers whose square has its digits in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A028819 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isNondecreasingDigits(mN.square())) {
        return mN;
      }
    }
  }
}
