package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004486.
 * @author Sean A. Irvine
 */
public class A004486 extends A004481 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return wytQueens(mN, Z.FIVE);
  }
}

