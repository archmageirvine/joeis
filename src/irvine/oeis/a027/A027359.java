package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027359.
 * @author Sean A. Irvine
 */
public class A027359 extends A027356 {

  private int mN = 0;
  private int mM = 0;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mS = Z.ZERO;
    }
    mS = mS.add(t(mN, mM));
    return mS;
  }
}
