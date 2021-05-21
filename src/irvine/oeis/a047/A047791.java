package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A047791 Numbers n such that n plus digit sum of n (A007953) equals a prime.
 * @author Sean A. Irvine
 */
public class A047791 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.add(ZUtils.digitSum(mN)).isProbablePrime()) {
        return mN;
      }
    }
  }
}
