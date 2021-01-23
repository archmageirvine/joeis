package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038368 n is divisible by |(product of digits) - (sum of digits)|.
 * @author Sean A. Irvine
 */
public class A038368 implements Sequence {

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = ZUtils.digitProduct(mN).subtract(ZUtils.digitSum(mN)).abs();
      if (!t.isZero() && mN.mod(t).isZero()) {
        return mN;
      }
    }
  }
}
