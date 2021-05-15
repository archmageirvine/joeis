package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a004.A004481;

/**
 * A047708.
 * @author Sean A. Irvine
 */
public class A047708 extends A004481 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return wytQueens(mN, mN);
  }
}
