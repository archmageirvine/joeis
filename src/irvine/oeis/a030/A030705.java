package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030705 Numbers n such that the decimal expansion of 9^n contains no zeros (probably finite).
 * @author Sean A. Irvine
 */
public class A030705 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(9);
      }
      if (!ZUtils.containsZero(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}


