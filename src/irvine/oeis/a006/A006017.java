package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A006017.
 * @author Sean A. Irvine
 */
public class A006017 extends A051775 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.shiftLeft(1);
    return get(mN, mN);
  }
}

