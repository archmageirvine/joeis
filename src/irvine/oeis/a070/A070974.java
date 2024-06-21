package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070974 extends A006577 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return a(mF);
  }
}
