package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A061909 Skinny numbers: numbers n such that there are no carries when n is squared by "long multiplication".
 * @author Sean A. Irvine
 */
public class A061909 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long ds = ZUtils.digitSum(mN);
      if (ds * ds == ZUtils.digitSum(mN.square())) {
        return mN;
      }
    }
  }
}
