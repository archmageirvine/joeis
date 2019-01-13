package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014782.
 * @author Sean A. Irvine
 */
public class A014782 extends A014780 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 2;
    }
    if (mM == 3 || mM == 2 * mN - 1) {
      return next();
    }
    return get(mN, mM);
  }
}
