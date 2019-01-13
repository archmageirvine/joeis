package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006243.
 * @author Sean A. Irvine
 */
public class A006243 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(198) : mA.pow(3).subtract(mA.multiply(3));
    return mA;
  }
}
