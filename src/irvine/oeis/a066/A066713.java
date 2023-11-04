package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066713 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.ONE.shiftLeft(++mN);
    return ZUtils.sortDigitsAscending(ZUtils.reverse(n).add(n));
  }
}
