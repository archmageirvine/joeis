package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.a006.A006387;

/**
 * A214816 Number of unsensed maps with n edges on a surface of genus g, summed on g = 0 through [n/2]..
 * @author T. R. S. Walsh
 */
public class A214816 extends A006387 {

  private int mN = -1;

  @Override
  public Z next() {
    count(2, ++mN, 1, mN + 1, false);
    return Z.valueOf(mSumSumU);
  }
}
