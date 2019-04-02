package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A004473 Nim product 8 * n.
 * @author Sean A. Irvine
 */
public class A004473 extends A051775 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(Z.EIGHT, mN);
  }
}

