package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045646 Alternative version of A006050.
 * @author Sean A. Irvine
 */
public class A045646 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : (Z.ONE.equals(mA) ? Z.TEN : Z.TEN.pow(mA.subtract(1).divide(9)).multiply2().subtract(1));
    return mA;
  }
}
