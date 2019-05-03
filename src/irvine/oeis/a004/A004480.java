package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A004480 Nim product <code>15 *</code> n.
 * @author Sean A. Irvine
 */
public class A004480 extends A051775 {

  private static final Z MULT = Z.valueOf(15);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(MULT, mN);
  }
}

