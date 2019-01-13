package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006242.
 * @author Sean A. Irvine
 */
public class A006242 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.pow(3).subtract(mA.multiply(3));
    return mA;
  }
}
