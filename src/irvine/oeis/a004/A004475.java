package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A004475 Nim product <code>10 * n</code>.
 * @author Sean A. Irvine
 */
public class A004475 extends A051775 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return get(Z.TEN, mN);
  }
}

