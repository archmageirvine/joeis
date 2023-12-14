package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067328 Scaled triangle A067327.
 * @author Sean A. Irvine
 */
public class A067328 extends A067327 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM).divide(mB.get(mM, mM));
  }
}

