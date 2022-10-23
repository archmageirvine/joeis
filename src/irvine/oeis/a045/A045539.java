package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A045539 Multiply by 5 and reverse.
 * @author Sean A. Irvine
 */
public class A045539 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : ZUtils.reverse(mA.multiply(5));
    return mA;
  }
}
