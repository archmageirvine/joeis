package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060074 Triangle A060058 by diagonals.
 * @author Sean A. Irvine
 */
public class A060074 extends A060058 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mA.get(mN, mN - mM);
  }
}
