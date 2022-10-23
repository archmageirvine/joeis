package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A007399 Add 8, then reverse digits!.
 * @author Sean A. Irvine
 */
public class A007399 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : ZUtils.reverse(mA.add(8));
    return mA;
  }
}
