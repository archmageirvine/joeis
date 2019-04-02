package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004485 Sprague-Grundy values for game of Wyt Queens.
 * @author Sean A. Irvine
 */
public class A004485 extends A004481 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return wytQueens(mN, Z.FOUR);
  }
}

