package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A006042 Nim-squares.
 * @author Sean A. Irvine
 */
public class A006042 extends A051775 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(mN, mN);
  }
}

