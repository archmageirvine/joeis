package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006266 A continued cotangent.
 * @author Sean A. Irvine
 */
public class A006266 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.pow(3).add(mA.multiply(3));
    return mA;
  }
}
