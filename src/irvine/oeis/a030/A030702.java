package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030702 Decimal expansion of 6^n contains no zeros (probably finite).
 * @author Sean A. Irvine
 */
public class A030702 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(6);
      }
      if (!ZUtils.containsZero(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}


