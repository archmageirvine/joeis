package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A004471 Nim product 6 * n.
 * @author Sean A. Irvine
 */
public class A004471 extends A051775 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(Z.SIX, mN);
  }
}

