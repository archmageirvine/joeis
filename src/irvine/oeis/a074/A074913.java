package irvine.oeis.a074;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a029.A029776;

/**
 * A074913 Digits of n appear in n^2 and in n^3.
 * @author Sean A. Irvine
 */
public class A074913 extends A029776 {

  {
    setOffset(0);
  }

  @Override
  protected boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    return IntegerUtils.ge(ZUtils.digitCounts(n.pow(3)), sn)
      && IntegerUtils.ge(ZUtils.digitCounts(n.square()), sn);
  }
}
