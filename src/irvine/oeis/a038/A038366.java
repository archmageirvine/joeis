package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038366 n is divisible by (product of digits) + (sum of digits).
 * @author Sean A. Irvine
 */
public class A038366 implements Sequence {

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(ZUtils.digitProduct(mN).add(ZUtils.digitSum(mN))).isZero()) {
        return mN;
      }
    }
  }
}
