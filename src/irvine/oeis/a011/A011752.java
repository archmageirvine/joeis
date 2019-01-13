package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a005.A005589;

/**
 * A011752.
 * @author Sean A. Irvine
 */
public class A011752 extends A005589 {

  private Z mN = Z.NEG_ONE;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mN = mN.add(1);
      mM = super.next().intValueExact();
    }
    return mN;
  }
}
