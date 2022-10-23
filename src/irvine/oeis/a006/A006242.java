package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006242 Extracting a square root.
 * @author Sean A. Irvine
 */
public class A006242 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.pow(3).subtract(mA.multiply(3));
    return mA;
  }
}
