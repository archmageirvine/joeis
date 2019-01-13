package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A006015.
 * @author Sean A. Irvine
 */
public class A006015 extends A051775 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(mN, Z.TWO);
  }
}

