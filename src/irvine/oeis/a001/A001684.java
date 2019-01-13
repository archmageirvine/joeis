package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001684.
 * @author Sean A. Irvine
 */
public class A001684 extends A001685 {

  private int mN = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (mN < 3) {
      ++mN;
      return Z.ONE;
    }
    mP = mP.multiply(super.next());
    return mP;
  }
}
