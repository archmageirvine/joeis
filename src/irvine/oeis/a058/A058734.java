package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A058734 Nim-product n*(n+1).
 * @author Sean A. Irvine
 */
public class A058734 extends A051775 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(mN, mN.add(1));
  }
}
