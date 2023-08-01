package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a029.A029776;

/**
 * A064931 Numbers n such that the digits of n are also digits of n^3.
 * @author Sean A. Irvine
 */
public class A064931 extends A029776 {

  {
    super.next();
  }

  @Override
  protected boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn.length; ++k) {
      if (sn3[k] < sn[k]) {
        return false;
      }
    }
    return true;
  }

}

